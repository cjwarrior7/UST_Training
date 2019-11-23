package com.jsp.ust;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;


public class MyJdbc {
    public static void main(String[] args) {
        System.out.println("**********Step1(Static way)****************");
        Driver d;
        try {
            d = new Driver();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }


        System.out.println("**********Step1(Dynamic way)****************");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class is load and Registered");
            System.out.println("Step2(Establish the Connection)");
            System.out.println("First way:");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_testdb_adv_java?user=root&password=root");
            System.out.println(con1);
            System.out.println("Second way:");
            final String url = "jdbc:mysql://localhost:3306/my_testdb_adv_java?";
            final String user = "root";
            final String password = "root";
            Connection con2 = DriverManager.getConnection(url, user, password);
            System.out.println(con2);
            System.out.println("Third Way:");
            FileReader fileReader = new FileReader("DemoJdbc/Config/dbcredentials.properties");
            Properties pr = new Properties();
            pr.load(fileReader);
            Statement st = con1.createStatement();
            System.out.println("Create the table");
            System.out.println("Insert the value");
            //create

            /**st.execute("Create table ust(id int not null auto_increment,ename varchar(255) not null, salary int(10) not null, primary key(id));");
             st.execute("insert into ust(ename,salary) values('walter', 20000) , ('johnny sins',1000000);");*/
            //read a query
            System.out.println("Displaying single as well as multiple records");
           // ResultSet rs = st.executeQuery("Select * from ust;");
            /**
             boolean b=rs.next();
             if(b) {
             System.out.println(rs.getInt("id") + " " + rs.getString("ename") + " " + rs.getString("salary"));
             }
             else{
             System.out.println("else no record found");
             }
             **/
           /** while (rs.next()) {


                System.out.println(rs.getInt("id") + " " + rs.getString("ename") + " " + rs.getString("salary"));



            rs.close();**/
            System.out.println("Update & Delete:");
            System.out.println("Update:");
            int rows = st.executeUpdate("Update ust set salary=salary+5000 where id=1;");
            System.out.println(rows);
            System.out.println("Delete:");
            int rows1 = st.executeUpdate("Delete from ust where id=2 ;");
            System.out.println(rows1);
            System.out.println("********************Prepared statement*******************");
            PreparedStatement pst = con1.prepareStatement("insert into ust(ename,salary) values(?,?)");
            System.out.println("platform created");
            // pst.setString(1,"Jhonny");
            // pst.setInt(2,20000);
            System.out.println("Data is set");
            // pst.execute();
            System.out.println("query executed");
            System.out.println("Update using Prepared statement");
            /**pst=con1.prepareStatement("update ust set salary=? where id=?");
             pst.setInt(1,2000);
             pst.setInt(2,1);
             pst.execute();
             int i=pst.executeUpdate();
             System.out.println("Updated:"+i);**/
            System.out.println("Delete using Prepared statement");
            // pst=con1.prepareStatement("Delete from ust where id=? ");
            // pst.setInt(1,4);
            // pst.execute();
            System.out.println("Fetch using Prepared statement");
            /**pst = con1.prepareStatement("select * from ust ");
            ResultSet resultSet = pst.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("ename") + " " + resultSet.getString("salary"));
            }**/
            System.out.println("*********************Using callable statement ************************");
            System.out.println("Insert using callable statement");
             /*CallableStatement cst= con1.prepareCall("{call ustp(?,?)}");
             cst.setString(1,"alok");
             cst.setInt(2,2000);
             cst.execute();**/
            System.out.println("Update using callable statement");
            /** CallableStatement cst=con1.prepareCall("{call ustp(?,?)}");
             cst.setInt(1,10000);
             cst.setInt(2,6);
             cst.execute();**/
           /** System.out.println("Read using callable statement");
            CallableStatement cst = con1.prepareCall("{call ustp(?,?,?)}");
            cst.registerOutParameter(1, Types.INTEGER);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.registerOutParameter(3, Types.INTEGER);**/
            System.out.println("Delete using callable statement");
            CallableStatement cst = con1.prepareCall("{call ustp(?)}");
            cst.setInt(1,2);
            cst.execute();
            System.out.println("Delete using callable statement successfully");



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
