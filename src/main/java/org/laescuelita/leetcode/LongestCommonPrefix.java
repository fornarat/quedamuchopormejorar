package org.laescuelita.leetcode;

public class LongestCommonPrefix{

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";

        String shortest = strs[0];

        for(int i=1; i<strs.length; i++){
            if(strs[i].length()<shortest.length()){
                shortest= strs[i];
            }
        }

        StringBuilder sb = new StringBuilder();

        boolean failed=false;

        for(int i=0; i<shortest.length(); i++){
            char c = shortest.charAt(i);
            boolean allEquals=true;
            for(int j=0; j<strs.length; j++){
                if(strs[j].charAt(i) != c){
                    failed=true;
                    allEquals=false;
                    break;
                }
            }
            if(allEquals){
                sb.append(c);
            }
            if(failed) break;
        }
        return sb.toString();
    }
}
