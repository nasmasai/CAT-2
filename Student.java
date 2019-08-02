package com.practicalcat.demo;

public class Student {
    private int studentNumber;
    private  String studentName;

    public Student(String studentName, int studentNumber){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
