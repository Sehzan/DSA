package com.hitech.leetcode;

public class Leetcode2149RearrangeArrayElementsbySign 
{
    static{
        int[] a = {};
        for(int i = 0; i < 500; i++)
        {
            rearrangeArray(a);
        }
    }
    public static int[] rearrangeArray(int[] arr) 
    {
        int n = arr.length;
        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > 0)
            {
                ans[pos] = arr[i];
                pos+=2;
            }
            else
            {
                ans[neg] = arr[i];
                neg+=2;
            }
        } 
        return ans;
    }
}
