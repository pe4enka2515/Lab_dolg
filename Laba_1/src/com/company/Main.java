package com.company;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(15 - 4) - 1;
        int[] nums = new int [n];
        for (int i = 0;i<n-1;i++){
            nums[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(nums));
        //сортировка
        int k;
        for(int j = 0; j < n-1; j++){
            if (nums[j] > nums[j+1]) {
                k = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = k;
                j = -1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
