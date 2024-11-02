package com.spring.lifecycle;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("spring called init method");
    }
    public void destroy(){
        System.out.println("spring called destroy method method");
    }
}
