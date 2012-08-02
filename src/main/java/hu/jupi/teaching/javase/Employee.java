package hu.jupi.teaching.javase;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class Employee {
    
    private NaturalPerson employeePerson;
    private Person employer;
    private Currency salaryCurrency;
    private BigDecimal salaryAmount;
    private String position;
    private Person[] superiors;
    private Date employmentStartDate;

    public NaturalPerson getEmployeePerson() {
        return employeePerson;
    }

    public void setEmployeePerson(NaturalPerson employeePerson) {
        this.employeePerson = employeePerson;
    }

    public Person getEmployer() {
        return employer;
    }

    public void setEmployer(Person employer) {
        this.employer = employer;
    }

    public Date getEmploymentStartDate() {
        return employmentStartDate;
    }

    public void setEmploymentStartDate(Date employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(BigDecimal salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public Currency getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(Currency salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public Person[] getSuperiors() {
        return superiors;
    }

    public void setSuperiors(Person[] superiors) {
        this.superiors = superiors;
    }
    
    
}
