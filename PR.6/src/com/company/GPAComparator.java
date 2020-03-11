package com.company;

public class GPAComparator implements Comparator {
    public int compare(Student a, Student b) {
        if(a.getGPA() < b.getGPA())
            return -1;
        else
        if(a.getGPA() == b.getGPA())
            return 0;
        else
            return 1;

    }
}