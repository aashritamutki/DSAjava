//Program: 9

//Given an array A[n] of integers, write a program to 
//find the maximum difference between any two elements 
//such that the larger element appears after the smaller element.

//Brute Force TC=O(n^2)
//Optimized way TC=O(n)
//maintain record for min_ele & max_diff

import java.util.*;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 8, 4, 10};
        findMaxDifference(arr);
    }

    static void findMaxDifference(int[] arr){

        int min_element = arr[0];
        int max_diff = arr[1] - arr[0];

        for(int i = 1; i < (arr.length-1); i++){
            if(arr[i] < min_element)
                min_element = arr[i];
            if((arr[i+1] - min_element) > max_diff)
                max_diff = arr[i+1] - min_element;
        }
        System.out.print("Maximum difference = " + max_diff);
    }
}
