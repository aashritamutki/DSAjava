import java.util.*;

public class BubbleSort_13 {
    public static void main(String[] args){
        int[] arr = {22,51,23,44,87,58,99,56,11,24};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int temp, flag = 0;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j+1] < arr[j]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
              break;
        }
        System.out.println("Sorted array :");
        for(int i = 0; i < n; i++){
           System.out.print(arr[i] + " ");
        }
    }
}
