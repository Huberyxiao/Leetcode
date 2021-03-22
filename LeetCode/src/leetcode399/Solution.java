package leetcode399;

import java.util.*;

public class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,Double> doubleMap=new HashMap<>(); 
        int i=0;
        for (List<String> equation : equations) {
           doubleMap.put(equation.get(0)+equation.get(1),values[i]);
           doubleMap.put(equation.get(1)+equation.get(0),1/values[i]);
           i++;
        }
        String[] strings=new String[queries.size()];
        i=0;
        for (List<String> query : queries) {
            strings[i]=query.get(0)+query.get(1);
            i++;
        }

        int len=queries.size();
        double[] doubles=new double[len];
        for (int j = 0; j < len; j++) {
            System.out.println(strings[j]+"$$"+doubleMap.get(strings[j]));
            System.out.println(doubleMap.toString());
            doubles[j]=doubleMap.containsKey(strings[j])?doubles[j]=doubleMap.get(strings[j]):-1.0;
        }
//       for (int j = 0; j < len; j++) {
//           System.out.println("结果"+strings[j]);
//       }

        return doubles;
    }
}