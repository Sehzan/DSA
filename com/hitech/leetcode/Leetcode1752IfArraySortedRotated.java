package com.hitech.leetcode;

public class Leetcode1752IfArraySortedRotated 
{
    public boolean check(int[] arr)
    {
        boolean isRotated = false;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] > arr[i])
            {
                if(!isRotated)
                {
                    isRotated = true;
                }
                else
                    return false;
            }
        }
        if(isRotated)
        {
            return arr[0] >= arr[arr.length -1];
        }
        return true;
    }
}
