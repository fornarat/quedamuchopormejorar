package org.laescuelita.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/count-nice-pairs-in-an-array/

nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])

nums[i] - rev(nums[i]) == nums[j] - rev(nums[j])

 */
public class CountNicePairsInAnArray {

    public int countNicePairs(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        long acc = 0;
        for (int i = 0; i < nums.length; i++) {
            Integer v = nums[i] - rev(nums[i]);

            if(map.containsKey(v)){
                acc += map.get(v);
            }
            map.merge(v,1, Integer::sum);
        }
        return (int) (acc % Math.pow(10,9)) + 7;
    }

    private int rev(Integer v){
        String reversed = new StringBuilder(v.toString()).reverse().toString();
        return Integer.parseInt(reversed);
    }

    // aplicar módulo

}
