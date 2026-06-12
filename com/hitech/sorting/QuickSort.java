package com.hitech.sorting;

import java.util.Scanner;

public class QuickSort
{

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = arr[low];
            int i = low;
            int j = high;
            while(i < j)
            {
                while(arr[i] <= pivot && i < high)
                    i++;
                while(arr[j] > pivot && j > low)
                    j--;
                if(i < j)
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            arr[low] = arr[j];
            arr[j] = pivot;

            quickSort(arr, low, j-1);
            quickSort(arr, j+1, high);
        }
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
            quickSort(arr, 0, n-1);
            System.out.println("Sorted: ");
            for(int i = 0; i < n; i++)
                System.out.print(arr[i]+" ");
        }
        catch(Exception e)
        {
            System.out.println("Error occured: "+e);
        }  
    }   
}