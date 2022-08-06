//Program: 17

//Given: array of integers arr[n] & an integer k
//Output: total number of continuous subarrays who sum is k
//Brute Force: TC=O(n^2)
//Optimized way: TC=O(n)
//maintain hashmap


import java.util.*;

public class SubarraySum{
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, -7, 8, 5, 5, -5}; 
        int n = arr.length;
        int sum = 5;

        int result = find_Subarray(arr, n, sum);
        System.out.print("Total number of subarrays with sum " + sum + " is " + result + ".");
    }

    static int find_Subarray(int[] arr, int n, int target_sum){
        int count = 0;
        int current_sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        for(int i = 0; i < n; i++){
            current_sum += arr[i];
            if(map.containsKey(current_sum-target_sum)){
                count += map.get(current_sum-target_sum);
            }
            /* 
            if(!map.containsKey(current_sum)){
                map.put(current_sum, 1);
            }
            else{
                map.put(current_sum, map.get(current_sum)+1);
            }
            same code in 1 line
            */
            map.put(current_sum, map.getOrDefault(current_sum, 0) + 1);
        }


        return count;
    }
}