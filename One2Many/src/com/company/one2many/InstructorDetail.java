package com.company.one2many;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InstructorDetail {
    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int Inid;
    private  String Gender;

    public int getInid() {
        return Inid;
    }

    public void setInid(int Inid) {
        this.Inid = Inid;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
}
