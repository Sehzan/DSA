package com.hitech.leetcode;


//OFF by 1 remember
public class Leetcode509Fibbonacci
{
    public int fib(int n) {
        
        if(n <= 1)
            return n;
        int a = 0;
        int b = 1;
        //here n;;;
        for(int i = 2; i <= n ;i++)
        {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}