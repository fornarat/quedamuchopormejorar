package org.laescuelita.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(); // <value, position>
        for (int i = 0; i < nums.length - 1; i++) {
            int l = nums[i];

            Integer compl = target - l;
            if(map.containsKey(compl)){
                return new int[]{i, map.get(compl)};
            }
            map.put(l, i);
        }
        return new int[]{};
    }

    public int[] twoSumN2(int[] nums, int target) {

        for (int i = 0; i < nums.length-1; i++) {
            int l = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int r = nums[j];
                if(l +r == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


}
