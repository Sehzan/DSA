package com.hitech.leetcode;

public class Leetcode31NextPermutation 
{
    public static void reverse(int[] arr, int st, int end)
    {
        while(st < end)
        {
            arr[st] = arr[st] + arr[end];
            arr[end] = arr[st] - arr[end];
            arr[st] = arr[st] - arr[end];
            st++;
            end--;
        }
    }
    public static void nextPermutation(int[] arr) 
    {
        int index = -1;
        int n = arr.length;
        for(int i = n - 2; i >= 0; i--)
        {
            if(arr[i] < arr[i+1])
            {
                index = i;
                break;
            }
        } 
        if(index == -1)
        {
            reverse(arr, 0, n-1);
            return;
        }
        for(int i = n-1; i > index; i--)
        {
            if(arr[i]>arr[index])
            {
                arr[i] = arr[i] + arr[index];
                arr[index] = arr[i] - arr[index];
                arr[i] = arr[i] - arr[index];
                break;
            }
        }
        reverse(arr, index + 1 , n-1);   
    }   
}
