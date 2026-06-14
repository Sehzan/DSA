package com.hitech.arrays;

public class Rotating 
{   
     public static void rotateLeft(int[] arr)
    {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++)
            arr[i-1] = arr[i];
        arr[arr.length - 1] = temp;
    }
    public static void rotateRight(int arr[])
    {
        int size = arr.length;
        int temp = arr[size - 1];
        
        for(int i = size-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = temp;
    }
    public static void reverse(int arr[], int st, int end)
    {
        while(st<end)
        {
            arr[st] = arr[st] + arr[end];
            arr[end] = arr[st] - arr[end];
            arr[st] = arr[st] - arr[end];
            st++;
            end--;
        }
    }
    public static void rotateLeft(int arr[], int k)
    {
        reverse(arr, 0, k-1);
        reverse(arr, k , arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
}
