package com.spring.ci;

public class Person {
    private int personId;
    private String name;
    private int age;
    private Certi certi;

    public Person(){
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", certi=" + certi +
                '}';
    }

    public Person(int personId, String name , int age, Certi certi) {
        this.personId = personId;
        this.name = name;
        this.age=age;
        this.certi=certi;
    }

}
