package com.company.shop;


import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ProductOper {

    public static void mainmenu(Session ss) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.SHOW ITEMS");
        System.out.println("2.SEARCH ITEMS");
        System.out.println("ENTER VALID OPTION");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                ProductOper.showitem(ss);
                break;
            case 2:
                ProductOper.searchitem(ss);
                break;

            default:
                System.out.println("INVALID");
        }

    }

    public static void showitem(Session ss) {
        Scanner sc = new Scanner(System.in);
        Query query = ss.createQuery("from Product_info");
        List<Product_info> list = query.list();
        for (Product_info i : list) {
            System.out.println(i.getDescription() + i.getProduct_Color() + i.getProduct_Name() + i.getNumber_ofProducts() + i.getProduct_Cost());
        }
        System.out.println("PRESS 1 TO BACK TO MAIN MENU");
        int inp=sc.nextInt();
        if(inp==1){
        mainmenu(ss);
        }else{
            System.out.println("ENTER VALID OPTION");
            showitem(ss);
        }


    }

    public static void searchitem(Session ss) {
        System.out.println("ENTER THE PRODUCT NAME TO SEARCH");
        Scanner sc = new Scanner(System.in);
        Product_info dto;
        do {
            String pro_search = sc.next();
            Criteria cr = ss.createCriteria(Product_info.class);
            cr.add(Restrictions.ilike("Product_Name", pro_search));
            dto = (Product_info) cr.uniqueResult();
        } while (dto == null);
        System.out.println(dto.getProduct_Name() + dto.getNumber_ofProducts() + dto.getProduct_Cost() + dto.getProduct_Color() + dto.getDescription());
        System.out.println("Press 1 to buy the Product");
        System.out.println("Press 2 to again go to Product Search");
        System.out.println("Press 3 to go last menu");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                ProductOper.buyitem(ss);
                break;
            case 2:
                ProductOper.searchitem(ss);
                break;
            case 3:
                ProductOper.mainmenu(ss);
                break;

            default:
                System.out.println("INVALID ");
        }


    }
    public static void buyitem(Session ss){
        System.out.println("ENTER PRODUCT ID TO BUY");
        System.out.println("ENTER 0 TO EXIT");
        Scanner sc = new Scanner(System.in);
        int product_id=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF PRODUCTS QUANTITY");
        int quantity=sc.nextInt();

        if( quantity>0) {
            Query query = ss.createQuery("from Product_info");
            List<Product_info> list = query.list();
            for (Product_info i : list) {
                if (quantity <= i.getNumber_ofProducts()
                ) {
                    if(i.getProduct_ID()==product_id){
                    double eachcost = i.getProduct_Cost();
                    double amt_pay = quantity * eachcost;
                    System.out.println("AMOUNT TO BE PAY:"+amt_pay);
                    payment(ss);
                    }
                    else{
                        System.out.println("*****PRODUCT ID WRONG******");
                        buyitem(ss);


                    }

                }
                else {

                    System.out.println("OUT OF STOCK");
                    System.out.println("only left:" + i.getNumber_ofProducts() + "in stock");
                    buyitem(ss);
                }
            }
        }
            else{
                System.out.println("ENTER VALID PRODUCT ID AND VALID QUANTITY");
                buyitem(ss);


           
            }

        }



    public static void payment(Session ss){
    Scanner sc=new Scanner(System.in);
    System.out.println("************************WELCOME TO PAYMENT GATEWAY***************************");
        System.out.println("ENTER THE 16 DIGITS CARD NO:");
        BigInteger cardno=sc.nextBigInteger();

        if(cardno.toString().length()==16){
            System.out.println("ENTER 3 DIGIT CVV");
            String cvv=sc.next();
            if(cvv.length()==3 ){
                System.out.println("****************PAYMENT SUCCESSFULL ***********");
                System.out.println("ORDER PLACED");
                System.out.println("ENTER ADDRESS TO DELIVER");
                sc.nextLine();
                String addr=sc.nextLine();
                System.out.println("THANKS FOR SHOPPING");


            }else{
                System.out.println("BUY AGAIN WRONG CVV NO");
                buyitem(ss);
            }
        }
        else{
            System.out.println("BUY AGAIN WRONG CARD NO");
            buyitem(ss);
        }}

}
