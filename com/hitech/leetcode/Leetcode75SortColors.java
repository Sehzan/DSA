package com.hitech.leetcode;

public class Leetcode75SortColors {
    public void dutchNationalFlag(int[] arr)
    {
        int n = arr.length;
        int low = 0, mid =0, high = n-1;
        while(mid<=high)
        {
            switch (arr[mid]) {
                case 0 -> {
                    if (low != mid)
                    {
                        arr[low] = arr[low]^arr[mid];
                        arr[mid] = arr[low]^arr[mid];
                        arr[low] = arr[low]^arr[mid];
                    }
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                default -> {
                    if (high != mid)
                    {
                        arr[mid] = arr[high]^arr[mid];
                        arr[high] = arr[high]^arr[mid];
                        arr[mid] = arr[high]^arr[mid];
                    }
                    high--;
                }
            }
        }
    }
}
