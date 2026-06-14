package com.hitech.arrays;

public class MissingElement 
{

    public static int findOneMissing(int arr[], int n)
    {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            xor2 ^= arr[i];
            xor1 ^= i+1;
        }
        xor1 ^= n;
        return xor1^xor2;
    }   
    public static void main(String[] args) {
        System.out.println(findOneMissing(new int[]{1, 2, 3, 5}, 5));
    }
}
