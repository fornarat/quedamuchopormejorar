package org.laescuelita.leetcode;

/**
    https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
    28. Find the Index of the First Occurrence in a String
 */

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for(int i=0; i<n-m+1; i++){
            int k= i;
            int j =0;
            while(haystack.charAt(k)==needle.charAt(j)){
                k++;
                j++;
                if(j==m) return i;
            }
        }
        return -1;
    }
}
