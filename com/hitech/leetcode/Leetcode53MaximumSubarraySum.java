package com.hitech.leetcode;

public class Leetcode53MaximumSubarraySum
{
    public int maxSubArray(int[] arr) 
    {
        int n = arr.length;
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if(sum > max)
                max = sum;
            if(sum < 0)
                sum = 0; 
        }
        // // if empty subarrya is considered!
        // if(sum < 0)
        //     return 0;

        return max;
    }    
}
