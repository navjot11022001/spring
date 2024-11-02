package com.spring.lifecycle;

public class Annotations {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Annotations{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public Annotations() {
        super();
    }

//    @PostConstruct
//    public void start(){
//
//    }
//    @Predestroy
//    public void end(){
//
//    }
}
