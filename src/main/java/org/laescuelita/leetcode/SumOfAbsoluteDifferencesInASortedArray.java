package org.laescuelita.leetcode;

// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array
// 1685. Sum of Absolute Differences in a Sorted Array

public class SumOfAbsoluteDifferencesInASortedArray {

    public int[] getSumAbsoluteDifferences(int[] nums) {

        if(nums.length==0) return new int[0];

        int n = nums.length;
        int base =0;
        int acc =0;

        int[] res = new int[n];
        for(int i =1; i<n; i++){
            acc += nums[i]- nums[base]; //24
        }
        res[base]=acc;

        int prev = nums[base];
        for(int i =1; i<n; i++){
            int current = nums[i];
            int diff = current - prev;
            acc = acc + diff * ( 2 * i -n);
            res[i]=acc;
            prev=current;
        }
        return res;
    }
}
