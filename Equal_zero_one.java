//Program: 14

//Given: a binary array 
//Output: maximum length of contiguous array with equal number of zero & one
//Brute Force: TC=O(n^2) Check each subsequence whether it has no(1) = no(0)
//Optimized way: O(n)

import java.util.*;

public class Equal_zero_one{
    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 1, 1, 0, 1, 0};
        int n = arr.length;

        int result = maxSubseqEqualOneZero(arr, n);
        System.out.print("\n" + result);
    }

    static int maxSubseqEqualOneZero(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int max_length = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                sum += -1;
            }
            else{
                sum += 1;
            }

            if(map.containsKey(sum)){
                int current_length = i - map.get(sum);
                if(max_length < current_length)
                    max_length = current_length;
            }
            else{
                map.put(sum, i);
            }
        }

        return max_length;
    }

}

















