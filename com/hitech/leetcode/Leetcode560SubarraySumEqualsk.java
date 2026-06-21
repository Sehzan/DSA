package com.hitech.leetcode;

import java.util.HashMap;

public class Leetcode560SubarraySumEqualsk 
{
    public static int subarraySum(int[] arr, int k) 
    {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr)
        {
            map.put(sum, map.getOrDefault(sum, 0)+1);
            sum += n;
            count += map.getOrDefault(sum - k, 0);
        }

        return count;


        // int count = 0;
        // int n = arr.length;
        // int sum;
        // for(int i = 0; i < n; i++)
        // {
        //     sum = 0;
        //     for(int j = i; j < n; j++)
        //     {
        //         sum+=arr[j];
        //         if(sum == k)
        //             count++;
        //     }
        // }
        // return count;
    }    
}
