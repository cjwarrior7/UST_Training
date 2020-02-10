package com.company.example1;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StudentTelusko {
    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int roll_no;
    private String sname;
    private int marks;
    @OneToMany(mappedBy = "studenttelusko")
    private List<Laptop> laptop=new ArrayList<Laptop>();


    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }


    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
