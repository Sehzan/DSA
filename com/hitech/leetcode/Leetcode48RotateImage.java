package com.hitech.leetcode;

public class Leetcode48RotateImage
{
    public static void swap(int[][] matrix, int i, int j)
    {
        matrix[i][j] = matrix[i][j] ^ matrix[j][i];
        matrix[j][i] = matrix[i][j] ^ matrix[j][i];
        matrix[i][j] = matrix[i][j] ^ matrix[j][i];
    }
    public static void reverse(int[] arr, int st, int end)
    {
        while(st < end)
        {
            arr[st] = arr[st]^arr[end];
            arr[end] = arr[st]^arr[end];
            arr[st] = arr[st]^arr[end];
            end--;
            st++;
        }
    }
    public static void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                swap(matrix, i, j);
            }
        }
        for(int i = 0; i < n; i++)
        {
            reverse(matrix[i],0, m - 1);
        }
    }
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
}