package com.hitech.leetcode;

public class Leetcode1732FindtheHighestAltitude 
{
    public int largestAltitude(int[] gain) 
    {

        int n = gain.length;
        int max = 0, sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += gain[i];
            if(max < sum)
                max = sum;
        }    
        return max;

        // int n = gain.length;
        // int max = Integer.MIN_VALUE, sum = 0;
        // for(int i = 0; i < n; i++)
        // {
        //     if(max < sum)
        //         max = sum;
        //     sum += gain[i];
        // } 
        // if(max < sum)
        //     max = sum;    
        // return max;
    }

}
