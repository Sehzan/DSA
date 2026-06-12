package com.hitech.basics;


void print(int n)
{
    if(n==0)
        return;
    //prints in ascending order!

    //print(--n);
    //System.out.print(n+1+ " ");

    //prints in descending order!
    System.out.print(n+" ");
    print(--n);
}

void printName(int n)
{
    if(n == 0)
        return;
    System.out.print("Sehzan ");
    printName(--n);
}

int sum(int n)
{
    if(n == 1)
        return 1;
    return n + sum(--n);
}
int fact(int n)
{
   if(n == 1 || n == 0)
       return 1;
    return n*fact(n-1);
}
void main()
{
//    print(10);
//    printName(5);
//    System.out.println();
    System.out.println(sum(5));
    System.out.println(fact(5));

}