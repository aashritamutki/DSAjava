//Program: 18

//Given: arr[n+1] containing integers from [1, n] & only 1 duplicate number
//Output: duplicate number
//Brute Force: TC=O(n^2)
//Optimized way: TC=O(n)
//maintain hashmap

import java.util.*;
import java.lang.Math;

public class DuplicateNumber{
    public static void main(String[] args) {

        int[] arr = {3, 6, 4, 2, 5, 1, 1}; 
        int n = arr.length;

        int result = find_Duplicate(arr, n);
        System.out.println("\nDuplicate Number is " + result + ".");
    }

    static int find_Duplicate(int arr[], int n){
        
        int result = -1;
        int index;
        for(int i = 0; i < n; i++){
            index = arr[i];
            if(arr[Math.abs(index)-1] < 0){
                result = Math.abs(index);
                break;
            }
            else{
                arr[Math.abs(index)-1] = -arr[Math.abs(index)-1];
            }   
        }
        return result;  
    }

}