package com.hitech.arrays;

public class MaximumSubarraySum 
{
    public int maxSubArraySum(int[] arr) 
    {
        int n = arr.length;
        //print
        //int st, ansStart=-1, ansEnd = -1;
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            //print
            //if(sum == 0)
            //  st = i;
            sum += arr[i];
            if(sum > max)
            {
                max = sum;
                //print
                //ansStart = st;
                //ansEnd = i;
            }
            if(sum < 0)
                sum = 0; 
        }

        //print
        //for(int i = ansStart; i<= ansEnd;i++)
        //    System.out.print(arr[i] + ", ");  


        // // if empty subarrya is considered!
        // if(sum < 0)
        //     return 0;

        return max;
    }       
}
