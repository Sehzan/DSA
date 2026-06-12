package com.hitech.basics;


class Main {

    static int gcd(int a, int b) {
        while(a>0 && b>0)
        {
            if(a>b)
                a = a%b;
            else
                b = b%a;
        }
        if(a == 0) return b;
        return a;
    }

    static void main() {

        System.out.println("GCD of 52, 10: " + gcd(52, 10));

//    char ch = 'A';
//    for(int i=4;i>=0;i--)
//    {
//        for(int j=4;j>=i;j--)
//            System.out.print((char) (ch+j));
//        System.out.println();
//    }
    }
}