package Arrays;
public class MaxSubarraySum {

    static void maxSubarraysSumPrefixApproch(int arr[])
    {
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        int prefix [] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length ; i++)
        {
            prefix[i] = prefix[i-1] + arr[i ];
        }
        for (int i = 0; i < arr.length ; i++)
        {
            int start = i;
            for (int j = i; j < arr.length ; j++)
            {
                int end = j ;

                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];


                System.out.println(currSum+" ");
                if (maxSum < currSum)
                    maxSum = currSum ;
            }
        }
        System.out.println("max sum = "+maxSum);
    }


    public static void main(String[] args) {
        System.out.println("A subarray is a contiguous part of array. An array that is inside another array.");
        int arr[] = {2,4,6,8,10};
        maxSubarraysSumPrefixApproch(arr);
    }
}
