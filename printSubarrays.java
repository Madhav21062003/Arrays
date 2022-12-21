package Arrays;
public class printSubarrays {
    static void printSubarrays(int arr[]){
        int totalSubarrays = 0;
        int result = 0, temp=0 ;
        for (int i = 0; i < arr.length ; i++) {
            int start = i;
            for (int j = i; j < arr.length ; j++) {
                int end = j ;
                for (int k = start; k <=end ; k++) {    // Printing subarrays
                    System.out.print(arr[k]+" ");
                }
                temp += arr[j];
                result += temp;
                totalSubarrays++ ;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of Subarrys are : "+totalSubarrays);
        System.out.println(result);
    }
    public static void main(String[] args) {
        System.out.println("A subarray is a contiguous part of array. An array that is inside another array.");
        int arr[] = {1,2,3,4,5};
            printSubarrays(arr);
    }
}
