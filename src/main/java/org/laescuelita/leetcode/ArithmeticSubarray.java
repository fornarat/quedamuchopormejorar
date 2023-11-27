package org.laescuelita.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/arithmetic-subarrays
public class ArithmeticSubarray {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> results = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            results.add(solve(nums, l[i], r[i]));
        }
        return results;
    }

    private boolean solve(int[] nums, int l, int r){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = l; i <=r ; i++) {
            int elem = nums[i];
            min = Math.min(min, elem);
            max = Math.max(max, elem);
        }

        int mod = (max - min) % (r - l);
        if(mod !=0) return false;

        Set<Integer> elems = new HashSet<>();
        for (int i = l; i <=r ; i++) {
            int elem = nums[i];
            elems.add(elem);
        }
        int step = (max - min) / (r - l);

        for (int i = min; i<max ; i=i+step) {
            if(!elems.contains(i)){
                return false;
            }
        }
        return true;
    }

}
