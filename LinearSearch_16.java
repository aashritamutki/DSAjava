public class LinearSearch_16 {
    public static void main(String[] args){
        int[] arr = {22,51,23,44,87,58,98,56,11,24};
        int num = 44;

        LinearSearch_16 ob = new LinearSearch_16();
        int position = ob.linearSearch(arr, num);

        if(position == -1)
            System.out.print(num + " is not present in the array.");
        else
            System.out.print(num + " is at position " + position);
    }

    int linearSearch(int[] arr, int num){

        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
