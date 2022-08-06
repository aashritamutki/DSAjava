//Program: 15

//Given: an integer array a[n]
//Output: smallest positive missing number
//Brute Force: TC=O(n^2)
//Optimized way: TC=O(n)
//separate +ve and -ve elements & make number at index=number at current position

import java.util.*;
import java.lang.Math;

public class SmallestPositive{
    public static void main(String[] args) {

        int[] arr = {-2,-3,-6,-5,1,-4}; 
        int n = arr.length;

        int result = find_smallest_missing_positive(arr, n);
        System.out.println("\nSmallest missing positive number is " + result);
    }

    static int find_smallest_missing_positive(int arr[], int n){
        int smallest = -1;
        int new_size = n;
        int j = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] <= 0){
                --new_size;
            }
            else{
                if(j != i){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        for(int i = 0; i < new_size; i++){

            if((Math.abs(arr[i])-1) < new_size){
                arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
            }
        }

        for(int i = 0; i < new_size; i++){
            if(arr[i] > 0){
                smallest = i+1;
                break;
            }
        }

        if(smallest == -1){
            smallest = ++new_size;
        }

        return smallest;
    }
}