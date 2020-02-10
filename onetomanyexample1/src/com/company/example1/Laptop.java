package com.company.example1;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int lid;
    private String lname;
    @ManyToOne
    private StudentTelusko studenttelusko;
    public StudentTelusko getStudent() {
        return studenttelusko;
    }

    public void setStudent(StudentTelusko studenttelusko) {
        this.studenttelusko = studenttelusko;
    }




    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
