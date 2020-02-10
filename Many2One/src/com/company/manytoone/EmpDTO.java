package com.company.manytoone;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
@Entity
public class EmpDTO {
    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
   private int eid;
   private  String ename;
   private double esal;
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(referencedColumnName = "cid")
   private CompanyDTO cdto;

    public int getEid() {
        return eid;
    }

    public CompanyDTO getCdto() {
        return cdto;
    }

    public void setCdto(CompanyDTO cdto) {
        this.cdto = cdto;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }
}
