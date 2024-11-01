package com.spring.ci;

public class Person {
    private int personId;
    private String name;
    private int age;

    public Person(){
        super();
    }
    public Person(int personId, String name ,int age) {
        this.personId = personId;
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", age='"+ age + '\''+
                '}';
    }
}
