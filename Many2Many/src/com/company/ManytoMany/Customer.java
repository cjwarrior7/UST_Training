package com.company.ManytoMany;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int cid;
    private String cname;
    private String ctype;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="ven_cus",JoinColumns = @JoinColumn(name="vid"),inverseJoinColumns=@JoinColumn(name ="cid"))


}
