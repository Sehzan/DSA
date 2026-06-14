package com.hitech.leetcode;

public class Leetcode136SingleNumber
{
    public int singleNumber(int[] arr)
    {
        int number = 0;
        for(int i : arr)
        {
            number ^= i;
        }
        return number;   
    }    
}
