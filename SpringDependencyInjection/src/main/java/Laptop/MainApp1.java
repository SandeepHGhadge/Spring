package Laptop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
    Laptop l=c1.getBean("laptop1", Laptop.class);

}
