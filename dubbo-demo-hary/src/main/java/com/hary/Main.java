package com.hary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.hary")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        RedCar redCar = applicationContext.getBean("redCar", RedCar.class);
        redCar.sayHello();
        System.out.println(redCar);

    }
}
