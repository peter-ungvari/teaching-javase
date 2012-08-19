package hu.jupi.teaching.javase;

import java.util.Date;

public class NaturalPerson extends Person {
    
    private Gender gender;
    private Date dateOfBirth;
    private String email;
    private NaturalPerson mother;
    private NaturalPerson father;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public NaturalPerson getFather() {
        return father;
    }

    public void setFather(NaturalPerson father) {
        this.father = father;
    }

    public NaturalPerson getMother() {
        return mother;
    }

    public void setMother(NaturalPerson mother) {
        this.mother = mother;
    }
    
}
