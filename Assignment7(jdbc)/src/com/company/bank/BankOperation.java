package com.company.bank;

import java.sql.*;

public class BankOperation {
    double amt;

    public BankOperation(double amt) {
        this.amt = amt;
    }

    public void request(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class is load and Registered");
            System.out.println("Step2(Establish the Connection)");
            System.out.println("First way:");
            Connection con1= null;
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_testdb_adv_java?user=root&password=root");
            PreparedStatement pst=con1.prepareStatement("Update ust_group set salary=salary+? where ac_name=?;");
            pst.setDouble(1,amt);
            pst.setString(2,"alok");

            int i= pst.executeUpdate();
            System.out.println(i );
            if(i>0){
                PreparedStatement pst1=con1.prepareStatement("Update ust_group set salary=salary-? where ac_name=?;");
                pst1.setDouble(1,amt);
                pst1.setString(2,"karan");
                int j= pst1.executeUpdate();
                System.out.println(j);
                    }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }


    }
}
