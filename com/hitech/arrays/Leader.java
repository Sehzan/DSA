package com.hitech.arrays;

import java.util.ArrayList;
import java.util.List;

public class Leader
{
    public List<Integer> leaders(int[] arr) 
    {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--)
        {
            if(max < arr[i])
                ans.add(arr[i]);
            max = Math.max(max, arr[i]);
        }
        ans.sort((a,b) -> b.compareTo(a));
        //ans.sort(Collections.reverseOrder());
        return ans;
    }
}