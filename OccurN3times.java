//Program: 10

//finding element occuring more than n/3 times
//Brute Force TC=O(n^2)
//Optimized way 
//Using hashSet TC=O(n) SC=O(n) for storing count of each
//Moore's voting algorithm SC=O(1)

import java.util.*;

public class OccurN3times {
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

        int answer = result(arr, n);

        System.out.print("\n" + answer);
    }
    
    static int result(int[] arr, int n){

        int answer = -1;
        int candidate = 0;
        int count = 1;

        for(int i = 1; i < n; i++){
            if(arr[candidate] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                candidate = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[candidate] == arr[i]){
                count++;
            }
        }
        if(count > (n/3)){
            answer = arr[candidate];
        }
        return answer;
    }
}
