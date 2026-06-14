package com.hitech.arrays;

import java.util.ArrayList;

public class Union
{
public static ArrayList<Integer> zeroes(int arr1[], int arr2[])
    {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
               if(union.isEmpty() || (int)union.getLast() !=  arr1[i])
               {
                    union.add(arr1[i]);
               }
               i++;
            }
            else
            {
                if(union.isEmpty() || (int)union.getLast() !=  arr2[j])
               {
                    union.add(arr2[j]);
               }
               j++;
            }
        }
        while(i < arr1.length)
        {
            if(union.isEmpty() || (int)union.getLast() !=  arr1[i])
               {
                    union.add(arr1[i]);
               }
            i++;
        }
        while(j < arr2.length)
        {
            if(union.isEmpty() || (int)union.getLast() !=  arr2[j])
               {
                    union.add(arr2[j]);
               }
               j++;
        }
        return union;
    }
}
