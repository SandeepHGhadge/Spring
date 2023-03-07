package Constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car r1=c1.getBean("Car1", PetrolCar.class);
        r1.getType();
        r1.getEngineInfo();

        Car r2=c1.getBean("Car2", DieselCar.class);
        r2.getType();
        r2.getEngineInfo();
    }
}
