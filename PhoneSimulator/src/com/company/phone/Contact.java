package com.company.phone;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "Name" , name="uniqueNameConstraint")})
public class Contact {

    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int id;
    @Column(unique = true)
    private String Name;
    @Column(unique = true)
    private Long Number;
    private String PhGroup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getNumber() {
        return Number;
    }

    public void setNumber(Long number) {
        Number = number;
    }

    public String getPhGroup() {
        return PhGroup;
    }

    public void setPhGroup(String Phgroup) {
        this.PhGroup = Phgroup;
    }
}
