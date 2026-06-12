package com.hitech.basics;
import java.util.Arrays;

public class FibonacciMemoization {
    private static long[] cache;

    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        // If already calculated, return the cached value
        if (cache[n] != -1) {
            return cache[n];
        }

        // Store the result in cache before returning
        cache[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 50;
        cache = new long[n + 1];
        Arrays.fill(cache, -1); // Initialize cache with -1

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}
