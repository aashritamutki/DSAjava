//Program: 16

//Given: array of prices p[n]
//Output: maximum profit (best time to buy & sell)
//Brute Force: TC=O(n^2)
//Optimized way: TC=O(n)
//maintain min pointer & check for max


import java.util.*;

public class StockBuySell{
    public static void main(String[] args) {

        int[] arr = {7,2,8,3,1,5}; 
        int n = arr.length;

        int result = find_max_profit(arr, n);
        System.out.println("\nMaximum Profit is " + result);
    }

    static int find_max_profit(int arr[], int n){

        int min = arr[0];
        int max_profit = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else{
                if(max_profit < (arr[i] - min)){
                    max_profit = arr[i] - min;
                }
            }
        }
        return max_profit;
    }
}