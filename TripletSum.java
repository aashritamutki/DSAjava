//Program : 3

import java.util.*;

//given an array A[] of n numbers and another number x, 
//determine three elements in A[] whose sum is exactly x

//manually TC = O(N^3)
//hence go for optimized way TC = O(n^2)
//sort the given array, fix first number
//maintain 2 pointers - left & right to find rest of 2 numbers

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {22,51,23,44,87,58,98,56,11,99};
        int sum = 77;
        
        TripletSum ob = new TripletSum();
        ob.mergeSort(arr, 0, arr.length-1);

        ob.find_triplet_sum(arr, sum);
    }

    void find_triplet_sum(int arr[], int original_sum){

        System.out.println("Sum is " + original_sum + ".");
        
        for(int i = 0; i < arr.length; i++){

            int left = 0;
            int right = arr.length-1;
            int sum = original_sum - arr[i]; 

            while(left < right){
                if(left == i)
                    left++;
                else if(right == i)
                    right--;

                if(arr[left] + arr[right] == sum){
                    System.out.print("Triplet numbers : " + arr[i] + " " + arr[left] + " " + arr[right]);
                    return;
                }
                else if(arr[left] + arr[right] < sum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        System.out.print("Sum is not matched.");
    }

    void mergeSort(int[] arr, int low, int high){
        int mid = low + (high - low) / 2;
        if(low < high){
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    void merge(int[] arr, int low, int mid, int high){
        int size1 = mid - low + 1;
        int size2 = high - mid;

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for(int i = 0; i < size1; i++){
            arr1[i] = arr[low + i];
        }
        
        for(int i = 0; i < size2; i++){
            arr2[i] = arr[mid + 1 + i];
        }

        int i, p1 = 0, p2 = 0;

        for(i = low; (p1 < size1) && (p2 < size2); i++){
            if(arr1[p1] < arr2[p2]){
                arr[i] = arr1[p1++];
            }
            else{
                arr[i] = arr2[p2++];
            }
        }

        while(p1 < size1){
            arr[i++] = arr1[p1++];
        }
        while(p2 < size2){
            arr[i++] = arr2[p2++];
        }
    }

}
