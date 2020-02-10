package com.company.ManytoMany;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Vendor  {

    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int vid;
    private String vname;
    private  String vtype;

    public int getvid() {
        return vid;
    }

    public void setvid(int vid) {
        this.vid = vid;
    }

    public String getvname() {
        return vname;
    }

    public void setvname(String vname) {
        this.vname = vname;
    }

    public String getvtype() {
        return vtype;
    }

    public void setCtype(String ctype) {
        this.vtype = vtype;
    }
}
