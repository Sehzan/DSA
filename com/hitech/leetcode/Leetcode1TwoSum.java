package com.hitech.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode1TwoSum
{
    public int[] twoSumOptimalForYesNo(int[] arr, int target)
    {
        int[] ans = new int[2];
        int n = arr.length;
        int left = 0, right = n-1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i], i);
        }
        Arrays.sort(arr);

        while(left < right)
        {
            int sum = arr[left] + arr[right];

            if(sum > target)
                right--;
            else if(sum < target)
                left++;
            else
            {
                ans[0] = map.get(arr[left]);
                ans[1] = map.get(arr[right]);
                return ans;
            }
        }
        return ans;
    }
    public int[] twoSum(int[] arr, int target)
    {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(target - arr[i]))
            {
                ans[0] = map.get(target - arr[i]);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        return ans;
    }   
    //better way to write
    public int[] twoSum1(int[] arr, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) 
        {
            Integer idx = map.get(target - arr[i]);
            if (idx != null) {
                return new int[]{idx, i};
            }

            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
