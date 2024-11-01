package com.spring.ref;

public class A {
private int xl;
private B obj;

    @Override
    public String toString() {
        return "A{" +
                "xl=" + xl +
                ", obj=" + obj +
                '}';
    }

    public int getXl() {
        return xl;
    }

    public void setXl(int xl) {
        this.xl = xl;
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    public A(int xl, B obj) {
        this.xl = xl;
        this.obj = obj;
    }
    public A() {
        super();
    }
}

