package com.hitech.basics;

import java.util.Scanner;

public class Hashing1
{
    static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. of terms : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter terms : ");
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int hash[] = new int[13];
            //Precomputation
            for(int j : arr)
                hash[j]++;
            System.out.println("Enter number of queries: ");
            int q = sc.nextInt();
            System.out.println("Enter queries:");
            while (q-- > 0) {
                //fetching
                System.out.println(hash[sc.nextInt()]);
                //q--;
            }
            // for character-hashing use hash[ch - 'a' or 'A']
        }
    }
}
