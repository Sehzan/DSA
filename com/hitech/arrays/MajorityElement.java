package com.hitech.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement
{
    public int majorityElementHashing(int[] arr) 
    {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(entry.getValue() > n/2)
                return entry.getKey();
        }
        return -1;
    }
    
    public int majorityElement(int[] arr) 
    {   
        //standard approach
        
    //     int n = arr.length;

    //     int count = 0, el = 0;

    //     // Find candidate
    //     for (int num : arr) {
    //         if (count == 0) {
    //             el = num;
    //             count = 1;
    //         } else if (num == el) {
    //             count++;
    //         } else {
    //             count--;
    //         }
    //     }

    //     // Verify candidate
    //     count = 0;
    //     for (int num : arr) {
    //         if (num == el) {
    //             count++;
    //         }
    //     }

    //     return (count > n / 2) ? el : -1;
        //my approach
        int n = arr.length;
        int count = 1, el =arr[0];
        for(int i = 1; i < n; i++)
        {
            if(count == 0)
            {
                count++;
                el = arr[i];
            }
            else if(arr[i] == el)
                count++;
            else 
            count--;
        }

        if(count == 0)
            return -1;
        
        count = 0;
        for(int val: arr)
            if(val == el)
                count++;

        if(count > n/2)
            return el;
        else
            return -1;
    }
}
