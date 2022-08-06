//Program : 7

//given an array of integers A[n] find sub-array(contigeous elements)
//with Maximum Sum
//Brute Force Approach TC = O(n^2)
//Optimized way - if sum < 0, sum = 0 TC = O(n)

import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {-3, 1, -8, 12, -4, 5, -8, 2};
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            current_sum += arr[i];

            if(current_sum > max_sum){
                max_sum = current_sum;
            }
            else if(current_sum < 0){
                current_sum = 0;
            }
        }
        System.out.print("Max Sum = " + max_sum);
    }
}
