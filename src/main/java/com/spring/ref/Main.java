package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("refConfig.xml");
        A objA = (A) a.getBean("aref");
        System.out.println(objA);
        System.out.println(objA.getObj());
        System.out.println(objA.getObj().getY());

    }
}
