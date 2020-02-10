package com.company.ess;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class Employee_Oper {
    public static void register() {
        try {
            System.out.println("Enter the Name");
            Scanner sc = new Scanner(System.in);
            String ename = sc.next();
            System.out.println("Enter the Employee Type");
            String etype = sc.next();
            System.out.println("Enter the Employee Email");
            String email = sc.next();
            System.out.println("Enter the Employee password");
            String password = sc.next();


            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class is load and Registered");
            System.out.println("Step2(Establish the Connection)");
            System.out.println("First way:");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_DB?user=root&password=root");
            System.out.println(con1);
            PreparedStatement pst = con1.prepareStatement("insert into Employee_info(Employee_Name,Employee_Type,Email,Password) values(?,?,?,?)");
            pst.setString(1, ename);
            pst.setString(2, etype);
            pst.setString(3, email);
            pst.setString(4, password);

            pst.execute();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void login() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Employee Email");
            String email = sc.next();
            System.out.println("Enter the Employee password");
            String password = sc.next();


            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class is load and Registered");
            System.out.println("Step2(Establish the Connection)");
            System.out.println("First way:");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_DB?user=root&password=root");
            System.out.println(con1);
            PreparedStatement pst = con1.prepareStatement("select Employee_Type from Employee_info where email=? and password=?");
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Employee_Type"));
                if (resultSet.getString("Employee_Type").equals("Manager")) {
                    System.out.println("ENTER 1.show leave 2.approve or reject leave");
                    int options = sc.nextInt();
                    switch (options) {
                        case 1:
                            showallleave(con1);
                            break;
                        case 2:
                            operonleave(con1);

                            break;

                        default:
                            System.out.println("INVALID");
                    }
                } else {
                    System.out.println("ENTER 1.show leave status 2.to request leave");
                    int options = sc.nextInt();
                    switch (options) {
                        case 1:
                            toshowstatus(con1, email, password);
                            break;
                        case 2:
                            toreqleave(con1, email, password);

                            break;

                        default:
                            System.out.println("INVALID");
                    }
                }
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void showallleave(Connection con1) {
        try {
            PreparedStatement pst1 = con1.prepareStatement("select Employee_ID ,Leave_Date ,Leave_Status from Employee_info where Leave_Date is not null");
            ResultSet resultSet = pst1.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Employee_ID") + " " + resultSet.getString("Leave_Date") + " " + resultSet.getString("Leave_Status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void operonleave(Connection con1) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Employee ID");
            int emp_id = sc.nextInt();
            System.out.println("Enter the Leave Status:(Approved/Rejected)");
            String leave_status = sc.next();

            PreparedStatement pst1 = con1.prepareStatement("update Employee_info set Leave_Status=? where Employee_Id=? ");

            pst1.setString(1,leave_status);
            pst1.setInt(2,emp_id);
            int updated = pst1.executeUpdate();
            System.out.println(updated);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void toreqleave(Connection con1, String email, String password) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date of leave");
        String leave_date = sc.next();
        try {
            PreparedStatement pst1 = con1.prepareStatement("update Employee_info set Leave_Date=?,Leave_Status='pending2' where Email=? and Password=?");
            pst1.setString(1, leave_date);
            pst1.setString(2, email);
            pst1.setString(3, password);
            int row = pst1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void toshowstatus(Connection con1, String email, String password) {
        try {
            PreparedStatement pst1 = con1.prepareStatement("select * from Employee_info where Email=? and Password=?");
            pst1.setString(1, email);
            pst1.setString(2, password);
            ResultSet resultSet = pst1.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Employee_ID") + " " + resultSet.getString("Leave_Date") + " " + resultSet.getString("Leave_Status") + " " + resultSet.getString("Employee_Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
