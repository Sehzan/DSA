package com.hitech.leetcode;

class Leetcode1134Armstrong {
    public boolean isArmstrong(int n) {
        int original = n;

        // Count digits
        int digits = (n == 0) ? 1 : 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Precompute digit^digits
        int[] pow = new int[10];
        for (int d = 0; d <= 9; d++) {
            int p = 1;
            for (int i = 0; i < digits; i++) {
                p *= d;
            }
            pow[d] = p;
        }

        // Calculate Armstrong sum
        int sum = 0;
        temp = n;

        if(n == 0 || n == 1)
            return true;

        while (temp > 0) {
            sum += pow[temp % 10];

            if (sum > original) {
                return false;
            }

            temp /= 10;
        }

        return sum == original;
    }
}