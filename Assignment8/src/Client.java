import com.company.stud.Student;

import java.math.BigInteger;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String sname=sc.next();
        System.out.println("Enter your stream");
        String stream=sc.next();
        System.out.println("Enter your yop");
        int yop=sc.nextInt();
        System.out.println("Enter your percentage");
        double percentage=sc.nextDouble();
        System.out.println("Enter your contact");
        BigInteger contact_no=sc.nextBigInteger();
        System.out.println("Enter your email");
        String email_id=sc.next();
        Student stud=new Student(sname,stream,yop,percentage,contact_no,email_id);
        try {
            stud.register();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
