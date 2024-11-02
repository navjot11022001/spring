package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        context.registerShutdownHook();
//        Samosa s1 = (Samosa) context.getBean("s1");
//        Pepsi p1=(Pepsi) context.getBean("p1");
//        System.out.println(s1);
//        System.out.println("+++++++++++++++++++++");
//        System.out.println(p1);

        Annotations annot=(Annotations) context.getBean("annot");
        System.out.println(annot);

    }

}
