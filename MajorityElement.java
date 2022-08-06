//Program : 8

//given an array of integers A[n] find the majority element
//majority element - occuring more than n/2 times 
//Brute Force TC = O(n^2)
//Optimized way - HashMap - no. & respective occurance
//TC = O(n) SC = O(n)
//Use Moore's voting algorithm TC = O(n), SC = 1
//Step 1 : Find a candidate for majority element
//Step 2 : Verify whether it's a majority element

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array : ");
        n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements :");
        for(int i = 0; i < n; i++){
            System.out.print("\nEnter arr[" + i + "] : ");
            arr[i] = in.nextInt();
        }

        int majorityIndex = findMajorityIndex(arr, n);

        if(majorityIndex != -1)
            System.out.print("\nMajority Element :" + arr[majorityIndex]);
        else
            System.out.print("\nNo Majority Element is Found");
    }

    static int findMajorityIndex(int[] arr, int n){
        int majorityIndex = 0;
        int count = 1;

        //step 1
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[majorityIndex])
                count++;
            else
                count--;
            if(count == 0){
                majorityIndex = i;
                count = 1;
            }
        }

        //step 2
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[majorityIndex])
                count++;
        }
        if(count > n/2)
            return majorityIndex;
        else
            return -1;
    }
}
