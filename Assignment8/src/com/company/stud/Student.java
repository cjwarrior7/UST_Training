package com.company.stud;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Student {

    String sname;
    String stream;
    int yop;
    double percentage;
    BigInteger contact_no;
    String email_id;

    public Student(String sname, String stream, int yop, double percentage, BigInteger contact_no, String email_id) {
        this.sname = sname;
        this.stream = stream;
        this.yop = yop;
        this.percentage = percentage;
        this.contact_no = contact_no;
        this.email_id = email_id;
    }

    public void register() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class is load and Registered");
            System.out.println("Step2(Establish the Connection)");
            System.out.println("First way:");
            Connection con1 = null;
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_testdb_adv_java?user=root&password=root");
            PreparedStatement pst = con1.prepareStatement("select contact , email from student;");
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                List<BigInteger> al = new ArrayList<>();
                al.add((resultSet.getBigDecimal("contact")).toBigInteger());
                if (al.contains(contact_no)) {
                    System.out.println(contact_no);
                    throw new Exception("Mobile number already exist");

                }
                List<String> al_email = new ArrayList<>();
                al_email.add(resultSet.getString("email"));
                if (al_email.contains(email_id)) {
                    System.out.println(email_id);
                    throw new Exception("email_id already exist");

                }


            }
            //count mobile number digits
            String temp = contact_no.toString();
            while (temp.length() != 10) {
                if (temp.length() != 10) {
                    throw new MyException("Mobile number is incorrect enter valid digits");
                }
            }
           //email check regex

            //String EMAIL_PATTERN1 = "[a-zA-Z0-9]{1,20}+@[a-zA-Z0-9]{1,20}+[.]{0,1}[a-zA-Z]{4,4}+";
            String EMAIL_PATTERN="[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]{2,3}+";
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            Matcher regexmatcher = pattern.matcher(email_id);
            if (!regexmatcher.matches()) {

                throw new Exception("Email format is not correct");
            }
           PreparedStatement pst1=con1.prepareStatement("Insert into student(sname,stream,yop,percentage,contact,email) values(?,?,?,?,?,?)");
           pst1.setString(1,sname);
           pst1.setString(2,stream);
           pst1.setInt(3,yop);
           pst1.setDouble(4,percentage);
           pst1.setBigDecimal(5,new BigDecimal(contact_no));
           pst1.setString(6,email_id);
           pst1.execute();


            System.out.println("*********registered successfully**********");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

