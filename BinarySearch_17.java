public class BinarySearch_17 {
    public static void main(String[] args){

        //input is sorted array
        int[] arr = {44,49,52,58,89,92,99};
        int num = 49;

        BinarySearch_17 ob = new BinarySearch_17();
        int position = ob.binarySearch(arr, num, 0, arr.length-1);

        if(position == -1)
            System.out.print(num + " is not present in the array.");
        else
            System.out.print(num + " is at position " + position);
    }

    int binarySearch(int[] arr, int num, int low, int high){

        if(low <= high){

            int mid = low + (high - low) / 2;
    
            if(arr[mid] == num){
                return mid;
            }
            if(arr[mid] > num){
                return binarySearch(arr, num, low, mid-1);
            }
            else{
                return binarySearch(arr, num, mid+1, high);
            }
        }
        return -1;
    }
}
