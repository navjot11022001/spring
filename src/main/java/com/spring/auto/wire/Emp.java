package com.spring.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    @Autowired
    @Qualifier("address2")
    private Address add;

    public Address getAdd() {
        return add;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "add=" + add +
                '}';
    }

    public void setAdd(Address add) {
        this.add = add;
        System.out.println("inside setter");
    }
//    @Autowired
    public Emp(Address add) {
        super();
        System.out.println("Inside constructo");
        this.add = add;
    }

    public Emp() {
        super();
    }
}
