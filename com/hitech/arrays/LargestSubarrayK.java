package com.hitech.arrays;

import java.util.HashMap;

public class LargestSubarrayK
{

    //Optimal for array containing positive, zero and negatives!
    public static int betterAndptimal(int[] arr, int k)
    {
        int n = arr.length;
        int maxlength = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        //optimisation
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];

            if (map.containsKey(sum - k)) 
            {
                maxlength = Math.max(maxlength, i - map.get(sum - k));
            }

            map.putIfAbsent(sum, i);
        }
        
        // for(int i=0;i<n;i++)
        // {
        //     sum += arr[i];
        //     if(sum == k)
        //     {
        //         maxlength = Math.max(maxlength, i+1);
        //     } 
        //     if(map.containsKey(sum-k))
        //     {
        //         maxlength = Math.max(maxlength, i-map.get(sum-k));
        //     }
        //     //edge case zero
        //     map.putIfAbsent(sum, i);
        // }
        return maxlength;
    }
    public static int optimalForNonNegative(int[] arr, int k)
    {
        int maxlength = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        while(right < arr.length)
        {
            while(left <= right && sum > k)
            {
                sum -= arr[left];
                left++;
            }
            if(sum == k)
            {
                maxlength = Math.max(maxlength, right - left + 1);
            }
            right++;
            if(right < arr.length)
                sum += arr[right];
        }
        return maxlength;
    }
    public static void main(String[] args) 
    {
        // System.out.println(better(new int[]{2, 0, 0, 0, 3}, 3));        
        System.out.println(optimalForNonNegative(new int[]{10, 5, 2, 7, 1, 9}, 15));        
    }
    
}
