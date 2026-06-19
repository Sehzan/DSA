package com.hitech.leetcode;

public class Leetcode1299ReplaceElementswithGreatestElementonRightSide 
{
    public static int[] replaceElements(int[] arr) 
    {
        int n = arr.length;
        int[] ans = new int[n];
        int max = -1;

        for(int i = n-1; i >= 0; i--)
        {
            ans[i] = max;
            if(max < arr[i])
                max = arr[i];
        }
        return ans;
    }
}
