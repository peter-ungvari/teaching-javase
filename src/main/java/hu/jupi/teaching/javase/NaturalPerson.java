package hu.jupi.teaching.javase;

import java.util.Date;

public class NaturalPerson extends Person {
    
    private Gender gender;
    private Date dateOfBirth;
    private String email;
    private NaturalPerson[] parents;

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

    public NaturalPerson[] getParents() {
        return parents;
    }

    public void setParents(NaturalPerson[] parents) {
        this.parents = parents;
    }

    
}
