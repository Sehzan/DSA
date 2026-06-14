package com.hitech.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode3731FindMissingElements
{
     public List<Integer> findMissingElements(int[] arr)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        // Arrays.sort(arr);
        // int count = 0;
        // for(int i = arr[0]; i <= arr[arr.length -1]; i++)
        // {
        //     if(arr[count] != i)
        //         ans.add(i);
        //     else
        //         count++;
        // } 


        // HashSet<Integer> hash = new HashSet<>();
        // int min = arr[0],max = arr[0];
        
        // for(int i: arr)
        // {
        //     min = min > i? i:min;
        //     max = max < i? i: max;
        //     hash.add(i);
        // }
        // for(int i = min; i <= max; i++)
        // {
        //     if(!hash.contains(i))
        //         ans.add(i);
        // }

        int min = arr[0],max = arr[0];
        boolean hash[] = new boolean[101];
        for(int i: arr)
        {
            min = min > i? i:min;
            max = max < i? i: max;
            hash[i] = true;
        }
        for(int i = min; i <= max; i++)
        {
            if(!hash[i])
                ans.add(i);
        }
        return ans;
    }   
}
