package org.laescuelita.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/diagonal-traverse-ii/


public class DiagonalTraverseII {

    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        int n = nums.size();
        int count = 0; // para el array de resultados
        int sumMax =0; // max (i+j)

        Map<Integer, List<Integer>> map = new HashMap<>(); // <id diagonal, list<elem>>
        for(int i=0; i<n; i++){
            List<Integer> row = nums.get(i);
            count += row.size();
            for(int j=0; j<row.size(); j++){
                int index = i+j; // id diagonal
                sumMax = Math.max(sumMax, index);

                if(map.containsKey(index)){
                    map.get(index).add(row.get(j));
                }
                else{
                    List<Integer> elems = new ArrayList<>();
                    elems.add(row.get(j));
                    map.put(index, elems);
                }
            }
        }

        int[] res = new int[count];
        int resIndex = 0;
        for(int i=0; i<=sumMax; i++){
            List<Integer> diag = map.get(i);
            for(int j=diag.size()-1; j>=0; j--){
                res[resIndex]=diag.get(j);
                resIndex++;
            }
        }
        return res;

    }
}
