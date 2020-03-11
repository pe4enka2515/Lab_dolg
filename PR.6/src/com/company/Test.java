package com.company;

public class Test {

    static void outputArray(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Name: " + array[i].getName() + ", idNumber: " + array[i].getIdNumber() + ", GPA: " + array[i].getGPA());
        }
    }

    static Student[] insertionSort(Student[] array){
        Student value;
        for(int i = 1; i < array.length; i++){
            value = array[i];
            int j = i;
            while(j > 0 && array[j - 1].getIdNumber() > value.getIdNumber()){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
        }
        return array;
    }

    public static void main(String[] args){
        Student[] studentOne = new Student[5];
        studentOne[0]  = new Student("Peter", 0, 5.0);
        studentOne[1]  = new Student("Mark", 8, 4.4);
        studentOne[2]  = new Student("Sam", 2, 3.7);
        studentOne[3]  = new Student("Paul", 1, 3.9);
        studentOne[4]  = new Student("John", 4, 3.5);

        System.out.println("Сортировка по id. \n");
        System.out.println("Неотсортированный список: ");
        outputArray(studentOne);

        System.out.println("\nОтсортированный список: ");
        outputArray(insertionSort(studentOne));
    }
}