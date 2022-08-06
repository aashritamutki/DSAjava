//Program : 5

import java.util.*;

//given an array A[n] find if there is sub-array(contigeous elements) with sum 0
//Simple approach : Brute Force TC : O(n^2)
//optimized way : Use hashSet, add 0 & go on inserting sum.
//if finds repeated sum(already existed) then OP : true or false
// TC : O(n), SC : O(n) (extra space for storing sum)

public class ZeroSum {
    public static void main(String[] args) {
        int[] arr = {100, -3, -4, 0, 2, -1};
        HasSubArrayWithZeroSum(arr);
    }

    static void HasSubArrayWithZeroSum(int[] arr){

        int sum = 0;
        Set<Integer> sums = new HashSet<>();

        //sums.add(0);

        for(int value: arr){
            sum += value;

            if(sums.contains(sum) || sum == 0){
                System.out.print(" true");
                return;
            }
            else{
                sums.add(sum);
            }
        }
        System.out.print("false");
    }
}