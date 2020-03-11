package com.company;

public class SortingStudentsByGPA {
    static void outputArray(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Name: " + array[i].getName() + ", idNumber: " + array[i].getIdNumber() + ", GPA: " + array[i].getGPA());
        }
    }

    static Student[] quickSort(Student[] array, int leftBorder, int rightBorder, GPAComparator cmp){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = array[(leftMarker + rightMarker) / 2];
        do {
            while (cmp.compare(array[leftMarker], pivot) == 1) {
                leftMarker++;
            }
            while (cmp.compare(array[rightMarker], pivot) == -1) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }

        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder, cmp);
        }
        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker, cmp);
        }

        return array;
    }

    public static void main(String[] args){
        Student[] studentTwo = new Student[5];
        GPAComparator gpac = new GPAComparator();
        studentTwo[0]  = new Student("James", 5, 4.2);
        studentTwo[1]  = new Student("Neil", 9, 3.0);
        studentTwo[2]  = new Student("Ivan", 7, 3.5);
        studentTwo[3]  = new Student("Dan", 3, 4.9);
        studentTwo[4]  = new Student("Alex", 6, 3.4);

        System.out.println("Сортировка по среднему баллу. \n");
        System.out.println("Неотсортированный список: ");
        outputArray(studentTwo);

        System.out.println("\nОтсортированный список: ");
        outputArray(quickSort(studentTwo, 0, studentTwo.length-1, gpac));
    }
}
