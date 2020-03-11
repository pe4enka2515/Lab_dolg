package com.company;

public class TwoListsMerging {
    static void outputArray(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Name: " + array[i].getName() + ", idNumber: " + array[i].getIdNumber() + ", GPA: " + array[i].getGPA());
        }
    }

    static Student[] merge(Student[] first, Student[] second){
        Student[] commonArray = new Student[first.length + second.length];
        for (int i = 0; i < commonArray.length; i++){
            if(i < first.length)
                commonArray[i] = first[i];
            else
                commonArray[i] = second[i - first.length];
        }
        return commonArray;
    }

    static Student[] mergeSort(Student[] source, int left, int right){

        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || source[cursor].getIdNumber() > source[delimiter].getIdNumber()) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);

        return source;
    }

    public static void main(String[] args){
        Student[] sortedById = new Student[5];
        Student[] notQuiteSortedByGPA = new Student[5];

        sortedById[0]  = new Student("Peter", 0, 5.0);
        sortedById[1]  = new Student("Paul", 1, 3.9);
        sortedById[2]  = new Student("Sam", 2, 3.7);
        sortedById[3]  = new Student("John", 4, 3.5);
        sortedById[4]  = new Student("Mark", 8, 4.4);

        notQuiteSortedByGPA[0]  = new Student("Dan", 3, 4.9);
        notQuiteSortedByGPA[1]  = new Student("James", 6, 4.2);
        notQuiteSortedByGPA[2]  = new Student("Alex", 5, 3.4);
        notQuiteSortedByGPA[3]  = new Student("Ivan", 7, 3.5);
        notQuiteSortedByGPA[4]  = new Student("Neil", 9, 3.0);

        outputArray(mergeSort(merge(sortedById, notQuiteSortedByGPA), 0, (sortedById.length + notQuiteSortedByGPA.length) - 1));
    }
}

