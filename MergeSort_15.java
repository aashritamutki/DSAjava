import java.util.*;

public class MergeSort_15 {
    public static void main(String[] args){
        int[] arr = {22,51,23,44,87,58,98,56,11,99};
        int n = arr.length;
        
        MergeSort_15 ob = new MergeSort_15();
        ob.mergeSort(arr, 0, n-1);

        System.out.println("\nSorted array :");
        for(int i = 0; i < n; i++){
           System.out.print(arr[i] + " ");
        }
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
