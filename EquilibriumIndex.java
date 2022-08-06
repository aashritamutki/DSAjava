//Program : 6

//sum of LHS = sum of RHS
//Brute Force TC = O(n^2)
//optimized approach - get total_arr_sum
//find rhs and lhs each time using total_sum and check whether they are equal
//TC = O(n)

import java.util.*;

public class EquilibriumIndex {
    public static void main(String[] args) {
        
        int[] arr = {2,1,-1,4,8,-6};
        System.out.print(findEquilibriumIndex(arr));

    }

    static int findEquilibriumIndex(int[] arr){

        int lhs = 0;
        int rhs = 0;
        int totalSum = getArraySum(arr);

        for(int i = 0; i < arr.length; i++){
            
            rhs = totalSum - arr[i] - lhs;
            if(lhs == rhs){
                return i;
            }
            lhs += arr[i];
        }

        return -1;
    }

    static int getArraySum(int[] arr){

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
