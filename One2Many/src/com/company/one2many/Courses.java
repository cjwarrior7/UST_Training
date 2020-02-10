package com.company.one2many;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Courses {
    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int cid;
    private String cname;
    @ManyToOne(cascade ={CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE })
    @JoinColumn(name="instructor_id")

    private Instructor instructor;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
