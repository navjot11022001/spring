package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //all initializing task can be don ehere
        System.out.println("PEPSI: After property set init method ");
    }

    @Override
    public void destroy() throws Exception {
        //all destroy funciton before object is destoryes
        System.out.println("PEPSI: Destroy method");
    }
}
