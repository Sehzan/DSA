package com.hitech.leetcode;

public class Leetcode485MaxConsecutiveOne 
{
    public int findMaxConsecutiveOnes(int[] arr) 
    {
        int count = 0, max = 0;

        for (int num : arr) {
            count = (num == 1) ? count + 1 : 0;
            max = (count > max) ? count : max;
        }

        return max;
    }  
    //Mine 
    //     public int findMaxConsecutiveOnes(int[] arr)
    // {
    //     int count = 0;
    //     int max = 0;
    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         if(arr[i] == 1)
    //             count++;
    //         else
    //         {
    //             if(max < count)
    //                 max = count;
    //             count = 0;
    //         }
    //     }
    //     if(max < count)
    //         max = count;
    //     return max;    
    // }
}
