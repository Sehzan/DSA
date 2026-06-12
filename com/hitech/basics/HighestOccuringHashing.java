package com.hitech.basics;


import java.util.HashMap;
import java.util.Map;

public class HighestOccuringHashing
{
    static void main()
    {
        int[] arr = {1, 4, 4, 5, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr)
            map.put(i, map.getOrDefault(i,0)+1);

        int max = arr[0];
        int most = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(entry.getValue() > max || (entry.getValue() == max && entry.getKey() < max))
            {
                most = entry.getValue();
                max = entry.getKey();
            }
        }


        System.out.println(max+ " " + most);
    }
}
