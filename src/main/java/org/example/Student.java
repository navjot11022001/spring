package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Student {
    private int studentId;
    private String studentName, studentAddress;
    private ArrayList<String> studentList;
    private Map<Integer,String> experience;
    private HashSet<Integer> phoneNumbers;

    public Student() {
        super();
    }

    public HashSet<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(HashSet<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Map<Integer, String> getExperience() {
        return experience;
    }

    public void setExperience(Map<Integer, String> experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentList=" + studentList +
                ", experience=" + experience +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("I Am setting student id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }
}