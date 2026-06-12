package com.hitech.basics;

import java.util.HashMap;
import java.util.Scanner;

public class HashingHashMap
{
    static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {

            //Inputting an array
            System.out.print("Enter no. of elements: ");
            int n = sc.nextInt();
            System.out.println("Enter elements:");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            //Pre Computing
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : arr)
                map.put(i, map.getOrDefault(i, 0) + 1);

            //Fetching
            System.out.print("Enter no. of queries:");
            int q = sc.nextInt();
            while (q-- > 0)
            {
                System.out.println(map.getOrDefault(sc.nextInt(), 0));
            }
            System.out.println(map);
        }
    }
}
