package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student st = (Student) context.getBean("student1");
        Student st2 =  (Student) context.getBean("student2");
        System.out.println(st);
//        System.out.println(st2.toString());
    }
}
