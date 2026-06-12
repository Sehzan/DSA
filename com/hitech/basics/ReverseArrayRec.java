package com.hitech.basics;


public class ReverseArrayRec
{
    public static void reverse(int st,int[] a,int end)
    {
        if(st>=end)
            return;
        a[st] = a[st] ^ a[end];
        a[end] = a[st] ^ a[end];
        a[st] = a[st] ^ a[end];
        reverse(st+1,a,end-1);
    }

    public static void reverseString(int st, StringBuilder s, int end)
    {
        if(st>=end)
            return;
        char ch = s.charAt(st);
        s.setCharAt(st,s.charAt(end));
        s.setCharAt(end,ch);
        reverseString(st+1,s,end-1);
    }
    public static boolean isPalindrome(int st, String s)
    {
        if(st>=(s.length()-1)/2)
            return true;
        if(s.charAt(st) != s.charAt(s.length()-1-st))
            return false;
        return isPalindrome(st+1, s);
    }

    public static int fib(int n)
    {
        if(n==1)
            return 1;
        else if (n <= 0)
            return 0;
        return  fib(n-1)+fib(n-2);
    }
    public static void printfib(int termsLeft, int current, int next)
    {
        if(termsLeft <= 0)
            return;

        System.out.print(current+" ");
        printfib(termsLeft-1, next, current+next);
    }
    public static void main(String args[])
    {
//        int a[] = {1, 2, 3, 4, 5};
//        reverse(0, a, a.length-1);
//        for (int j : a)
//            System.out.println(j);
//        StringBuilder s = new StringBuilder("Racing");
//        StringBuilder sorg = new StringBuilder(s);
//        reverseString(0,s,s.length()-1);
//        System.out.println(s);
//        System.out.println(sorg);
//        System.out.println(s.compareTo(sorg) == 0);
//        System.out.println(isPalindrome(0, "racecar"));

        System.out.println(fib(3));
        printfib(10,0,1);//O(n)
    }
}
