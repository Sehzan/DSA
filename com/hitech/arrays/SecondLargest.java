package com.hitech.arrays;

public class SecondLargest
{
        public static int  secondLargest(int[] arr)
    {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] < largest)
                secondLargest = arr[i];
        }
        if(secondLargest == Integer.MIN_VALUE)
            return -1;
        return secondLargest;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.print(secondLargest(arr));
    }
}
