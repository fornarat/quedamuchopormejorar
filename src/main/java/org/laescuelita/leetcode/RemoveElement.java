package org.laescuelita.leetcode;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int w=-1;

        for (int r = 0; r < nums.length; r++) {
            int current = nums[r];
            if(current!=val){
                w++;
                nums[w]= current;
            }
        }

        return w+1;

    }

}
