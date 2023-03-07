package Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select Machine Type");
        System.out.println("1:LAPTOP\n2:PROJECTOR");
        int choice= sc1.nextInt();
        Machine m1=null;
        if (choice==1){
            m1=c1.getBean("machine1", Machine.class);
        } else if (choice==2) {
            m1=c1.getBean("machine2", Machine.class);
        }
        if (m1!=null){
            m1.getType();
            m1.getPrice();
        }else {
            System.out.println("Invalid Choice");
        }

    }
}
