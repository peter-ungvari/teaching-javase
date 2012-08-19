package hu.jupi.teaching.javase.erpi;

import hu.jupi.teaching.javase.Employee;
import java.util.HashMap;
import java.util.Map;

public class SuperiorLevelCounter {
    
    private SuperiorLevelNode startNode = new SuperiorLevelNode();
    private Map<Employee, SuperiorLevelNode> employeeLevelMap = new HashMap<Employee, SuperiorLevelNode>();

    public SuperiorLevelCounter(Employee[] employees) {
        if(employees == null) {
            throw new IllegalArgumentException("The employees parameter cannot be null.");
        } else {
            for(Employee employee: employees) {
                getOrcreateEmployeeNode(employee);
            }
            countLevel(startNode);
        }
    }
    
    public int getSuperiorLevel(Employee employee) {
        int result = 0;
        SuperiorLevelNode levelNode = employeeLevelMap.get(employee);
        if(levelNode != null) {
            result = levelNode.getLevel();
        }
        return result;
    }

    private void countLevel(SuperiorLevelNode node) {
        for(SuperiorLevelNode child : node.getChildren()) {
            if(!child.isVisited()) {
                countLevel(child);
                child.setVisited(true);
                node.setLevel(Math.max(child.getLevel() + 1, node.getLevel()));
            }
        }
    }
    
    private SuperiorLevelNode getOrcreateEmployeeNode(Employee employee) {
        if(employee == null) {
            throw new IllegalArgumentException("The employee parameter cannot be null.");
        } else {
            SuperiorLevelNode employeeNode = employeeLevelMap.get(employee);
            if(employeeNode == null) {
                employeeNode = new SuperiorLevelNode(employee);
                employeeLevelMap.put(employee, employeeNode);
                Employee[] superiors = employee.getSuperiors();
                if(superiors == null || 0 == superiors.length) {
                    startNode.getChildren().add(employeeNode);
                } else {
                    for(Employee superior: superiors) {
                        SuperiorLevelNode superiorNode = getOrcreateEmployeeNode(superior);
                        superiorNode.getChildren().add(employeeNode);
                    }
                }
            }
            return employeeNode;
        }
    }
    
}
