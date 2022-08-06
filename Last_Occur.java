//Program: 12

//Find last occurance of an element in a sorted array
//Brute Force TC=O(n) linear search
//Optimized way TC=O(log n) Modified Binary Search

public class Last_Occur{
    public static void main(String[] args) {
        
        int[] arr = {2,3,3,5,5,6,6,8};
        int n = arr.length;
        int num = 3;

        BSearch(arr, num, 0, n-1);
    }

    static void BSearch(int[] arr, int num, int low, int high){
      
        int index = -1;
        while(low <= high){

            int mid = low + (high - low) / 2;

            if(num == arr[mid]){
                index = mid;
                low = mid + 1;
            }
            else if(num > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(index == -1){
            System.out.println(num + " is not present in the array.");
        }
        else{
            System.out.print(num + " is occured first at index " + index + ".");
        }
    }
}
