package com.company.one2many;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
class Instructor {
    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int in_id;
    private String in_name;
    private String in_email;
    @OneToOne(cascade = CascadeType.ALL)
    private InstructorDetail instructorDetail;



    @OneToMany(mappedBy = "instructor",cascade ={CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE })
    private List<Courses> courses;

    public int getIn_id() {
        return in_id;
    }

    public void setIn_id(int sid) {
        this.in_id = in_id;
    }

    public String getin_name() {
        return in_name;
    }

    public void setin_name(String in_name) {
        this.in_name = in_name;
    }

    public String getin_email() {
        return in_email;
    }

    public void setin_email(String in_email) {
        this.in_email = in_email;
    }

    public InstructorDetail getInstructorDetail() {
        return instructorDetail;
    }

    public void setInstructorDetail(InstructorDetail instructorDetail) {
        this.instructorDetail = instructorDetail;
    }
    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
    //add convience method for bidirectional relationship
    public void add(Courses tempcourse){
        if(courses==null){
            courses=new ArrayList<>();
        }
        courses.add(tempcourse);
        tempcourse.setInstructor(this);

    }
}