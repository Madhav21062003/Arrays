package Arrays;
import java.util.*;

    public class LargestNumber {
       static int  largestNumber(int num[]){
                int max = Integer.MIN_VALUE;
            for (int i = 0; i <num.length ; i++) {
                if (max < num[i]){
                    max = num[i];
                }
            }
            return  max ;
       }
       static int getminimum(int arr[]){
           int min  = Integer.MAX_VALUE;
           for (int i = 0; i < arr.length ; i++) {
               if (min > arr[i])
                   min = arr[i];
           }
           return min ;
       }
        public static void main(String[] args) {
                int arr[] = {22,5,6,7,5,4,333,};
                int largest = largestNumber(arr);
            System.out.println("largest number in an Array is = "+largest);
                int smallest = getminimum(arr);
            System.out.println("Smallest number in an Array is = "+smallest);
        }
   }
