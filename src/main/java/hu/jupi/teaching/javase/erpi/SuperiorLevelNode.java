package hu.jupi.teaching.javase.erpi;

import hu.jupi.teaching.javase.Employee;
import java.util.HashSet;
import java.util.Set;

public class SuperiorLevelNode {

    private int level;
    private boolean visited;
    private Employee employee;
    private Set<SuperiorLevelNode> children = new HashSet<SuperiorLevelNode>();

    public SuperiorLevelNode() {
    }

    public SuperiorLevelNode(Employee employee) {
        this.employee = employee;
    }

    public int getLevel() {
        return level;
    }

    public boolean isVisited() {
        return visited;
    }

    public Set<SuperiorLevelNode> getChildren() {
        return children;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setChildren(Set<SuperiorLevelNode> children) {
        this.children = children;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
