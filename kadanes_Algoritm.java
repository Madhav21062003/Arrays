package Arrays;
public class kadanes_Algoritm {
    static int maxSubarraySum(int arr[]){
        int n =arr.length ;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0 ;

        for (int i = 0; i <arr.length ; i++) {
            currSum = currSum + arr[i] ;
            if (currSum > maxSum)
                maxSum = currSum ;
            if (currSum < 0)
                currSum = 0;
        }
        return  maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Finding maximum subarray sum using Kadane's Algorithm because here the time complexity is O(n)");
        int a[] = {-1, -2, -3};
        System.out.println("The Maximum subarray sum = "+maxSubarraySum(a));
    }
}
