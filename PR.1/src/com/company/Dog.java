package com.company;

public class Dog {
    private String name;
    private String pedigree;
    private int age;

    Dog(String name, String pedigree, int age){
        this.name = name;
        this.pedigree = pedigree;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setPedigree(String pedigree){
        this.pedigree = pedigree;
    }
    String getPedigree(){
        return pedigree;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    public String toString() {
        return this.name + ", price " + this.age;
    }
    public void outDog() {
        System.out.println(name + ", " + age + " лет, корм - " + pedigree);
    }
}
