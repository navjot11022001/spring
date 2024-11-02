package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjectionConfig.xml");
        Person p = (Person) context.getBean("cnst");
        Addition add = (Addition) context.getBean("add");
        add.doSum();
        System.out.println("This is the person object" + p);
    }
}
