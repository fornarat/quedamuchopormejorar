package org.laescuelita.leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int prev = -200;
        int w = 0;

        for (int l = 0; l < nums.length; l++) {
            int current = nums[l];
            if(current != prev){
                nums[w] = current;
                w++;
                prev = current;
            }
        }
        return w;
    }

}
