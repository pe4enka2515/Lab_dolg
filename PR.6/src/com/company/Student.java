package com.company;

public class Student {
    private String name;
    private int idNumber;
    private double GPA;

    Student(String name, int idNumber, double GPA){
        this.name = name;
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    int getIdNumber(){
        return idNumber;
    }

    void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }

    double getGPA(){ return GPA; }

    void setGPA(double GPA){ this.GPA = GPA;}
}
