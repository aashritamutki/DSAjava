import java.util.*;

public class InsertionSort_14 {
    public static void main(String[] args){

        int[] arr = {22,51,23,44,87,58,98,56,11,24};
        int n = arr.length;

        for(int i = 1; i < n; i++){
            for(int j = i-1; j >= 0; j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else
                    break;
            }
        }    
        System.out.println("Sorted array :");
        for(int i = 0; i < n; i++){
           System.out.print(arr[i] + " ");
        }
    }
}
