package com.hitech.arrays;

import java.util.ArrayList;

public class Alternate 
{
    public static int[] rearrangeArray(int[] arr) 
    {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }
        if(pos.size() > neg.size())
        {
            for (int i = 0; i < neg.size(); i++) 
            {
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);   
            }
            int index = neg.size()*2;
            for(int i = neg.size(); i < pos.size(); i++)
            {
                arr[index] = pos.get(i);
                index++;
            }
        }
        else
        {
            for (int i = 0; i < pos.size(); i++) 
            {
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);   
            }
            int index = pos.size()*2;
            for(int i = pos.size(); i < neg.size(); i++)
            {
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;
    }    
}
