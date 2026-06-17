package com.hitech.arrays;

import java.util.HashMap;

public class TwoSum
{
    public int[] hashing(int arr[], int target)
    {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(target - arr[i]))
            {
                ans[0] = arr[i] < arr[map.get(target - arr[i])]? ans[i]:arr[map.get(target - arr[i])]; 
                ans[1] = arr[i] > arr[map.get(target - arr[i])]? ans[i]:arr[map.get(target - arr[i])]; 
                break;
            }
        }
        return ans;
    }

}