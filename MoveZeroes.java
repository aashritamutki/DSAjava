//Program : 4

import java.util.*;

//move zeroes to the end of the array
//brute force approach SC = O(N)
//hence maintain count of non-zero elements
//make change in the given array itself SC = O(1)

public class MoveZeroes {
 public static void main(String[] args) {
    int[] arr = {0,0,2,0,0,5,8,0,0,1};
    
    MoveZeroes ob = new MoveZeroes();
    ob.Move_zeroes_at_end(arr);

    System.out.print("Resulting array : ");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
 }   

 void Move_zeroes_at_end(int[] arr){

    int count = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] != 0){
            if(count != i)
                arr[count] = arr[i];
            count++;
        }
    }
    while(count < arr.length){
        arr[count++] = 0;
    }
 }
}
