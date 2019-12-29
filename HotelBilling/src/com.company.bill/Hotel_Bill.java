package com.company.bill;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Hotel_Bill {

    @Id
    @GenericGenerator(name = "auto", strategy = "increment")
    @GeneratedValue(generator = "auto")
    private int Item_Code;
    private  String Food_Name;
    private double Price;

    public int getItem_Code() {
        return Item_Code;
    }

    public void setItem_Code(int item_Code) {
        Item_Code = item_Code;
    }

    public String getFood_Name() {
        return Food_Name;
    }

    public void setFood_Name(String food_Name) {
        Food_Name = food_Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
