package Constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select Car Type");
        System.out.println("1:PETROL CAR\n2:DIESEL CAR");
        int choice= sc1.nextInt();
        Car c=null;
        if (choice==1){
            c=c1.getBean("Car1", PetrolCar.class);
        } else if (choice==2) {
            c=c1.getBean("Car2", DieselCar.class);
        }
        if (c!=null){
            c.getType();
            c.getEngineInfo();
        }else {
            System.out.println("INVALID CHOICE");
        }
    }
}
