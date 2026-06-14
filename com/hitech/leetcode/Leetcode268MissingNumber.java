package com.hitech.leetcode;

public class Leetcode268MissingNumber 
{
        public int missingNumber(int[] arr) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            xor2 ^= arr[i];
            xor1 ^= i+1;
        }
        return xor1^xor2;
    }  
}
