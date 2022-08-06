//Program: 13

//Given: unsorted array of integers
//Output: Sort the array into wave like array
//Brute Force: do normal sort then swap pairs
//Optimized way TC=O(n) compare odd index with previous & next

import java.util.*;

public class WaveArray {
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

        System.out.println("Input array :");
        for(int i = 0; i < n; i++){
           System.out.print(arr[i] + " ");
        }

        waveSort(arr, n);

        System.out.println("\nSorted wave like array :");
        for(int i = 0; i < n; i++){
           System.out.print(arr[i] + " ");
        }
    }

    static void waveSort(int[] arr, int n){

        for(int i = 1; i < n; i+=2){

            int temp;

            if(arr[i-1] > arr[i]){
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }

            if(i+1 < n){
                if(arr[i+1] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                } 
            }    
        }
    }
}
