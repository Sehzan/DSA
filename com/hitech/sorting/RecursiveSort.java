package com.hitech.sorting;

import java.util.Scanner;

public class RecursiveSort
{
        public static void  bubbleSort(int[] arr, int n)
    {
        if(n <= 1)
            return;
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        bubbleSort(arr, n-1);
    }
    public static void selectionSort(int[] arr, int start)
    {
         if (start >= arr.length - 1)
            return;

        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        selectionSort(arr, start + 1);
    }

    public static void insertionSort(int[] arr, int n) 
    {
        if (n <= 1)
            return;

        insertionSort(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }

    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n, arr[];
            System.out.print("Enter no. of elements: ");
            n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter elements: ");
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            selectionSort(arr, 0);
            //insertionSort(arr, n);
            //bubbleSort(arr, n);
            System.out.println("Sorted: ");
            for(int i = 0; i < n; i++)
                System.out.print(arr[i]+" ");
        } 
        catch (Exception e)
        {
            System.out.println("Error while inputting! "+e);
        }   
    }
}