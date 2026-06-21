package com.hitech.leetcode;

public class Leetcode169MajorityElement 
{
        public int majorityElement(int[] arr) {
        int n = arr.length;

        int count = 0, el = 0;

        // Find candidate
        for (int num : arr) {
            if (count == 0) {
                el = num;
                count = 1;
            } else if (num == el) {
                count++;
            } else {
                count--;
            }
        }

        // Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == el) {
                count++;
            }
        }

        return (count > n / 2) ? el : -1;
    }    
}
