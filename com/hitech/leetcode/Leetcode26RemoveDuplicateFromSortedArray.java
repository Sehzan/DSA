package com.hitech.leetcode;

public class Leetcode26RemoveDuplicateFromSortedArray
{
    public int removeDuplicates(int[] arr)
    {
        int i = 0, j = 0, count = 1;
        while(j < arr.length)
        {
            /*
            if(arr[j] != arr[i])
            {
                arr[i] = arr[j];
                i++;
            }
            return i+1;
            doesn't need count variable in this!
             */
            if(arr[i] < arr[j])
            {
                arr[count] = arr[j];
                count++;
                i = j;
            }
            j++;
        }
        return count;
    }     
        // public static int unique(int arr[])
    // {
    //     HashMap<Integer, Integer> cache = new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) 
    //         cache.put(arr[i], cache.getOrDefault(arr[i], 0)+1);   
    //     int count = 0;
    //     for(Map.Entry<Integer, Integer> entry : cache.entrySet())
    //     {
    //         if(entry.getValue() != 0)
    //         {
    //             arr[count] = entry.getKey();
    //             count++;
    //         }
    //     }
    //     return count;
    // }    
}
