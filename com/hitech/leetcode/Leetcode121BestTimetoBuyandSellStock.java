package com.hitech.leetcode;

public class Leetcode121BestTimetoBuyandSellStock 
{
    public int maxProfit(int[] prices) 
    {
        // Guard clause to handle empty or null arrays
        if (prices == null || prices.length == 0)
        {
            return 0;
        }
        
        int days = prices.length;
        int max = 0, min = prices[0];
        for(int i = 1; i < days; i++)
        {
            if(prices[i] < min)
                min = prices[i];  
            else
            {    
                int cost = prices[i] - min;
                if(max < cost)
                    max = cost;
            }    
        }
        return max;
    }
}
