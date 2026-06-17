package com.hitech.arrays;

public class MovingZeroes
{
    public void moveZeroes(int[] arr)
    {
        int i, j = -1;
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0 && j == -1)
                j = i;
            if(j != -1 && arr[i] != 0)
            {
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }   
    }

    //     public void moveZeroes(int[] nums) {
    //     int j = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != 0) {
    //             int temp = nums[i];
    //             nums[i] = nums[j];
    //             nums[j] = temp;
    //             j++;
    //         }
    //     }
    // }
        public void moveZeroes2(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}
