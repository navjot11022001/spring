package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("employeesConfig.xml");
        Employees emp=(Employees) context.getBean("emp1");
        System.out.println(emp);
    }
}
