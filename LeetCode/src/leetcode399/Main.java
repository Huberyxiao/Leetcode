package leetcode399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> equations=new ArrayList<>();
        double[] values=new double[]{2.0,3.0};
        List<List<String>> queries=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        list1.add("a");
        list1.add("b");
        List<String> list2=new ArrayList<>();
        list2.add("b");
        list2.add("c");
        equations.add(list1);
        equations.add(list2);
 //[["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
        List<String> list3=new ArrayList<>();
        list3.add("a");
        list3.add("c");
        List<String> list4=new ArrayList<>();
        list4.add("b");
        list4.add("a");
        List<String> list5=new ArrayList<>();
        list5.add("a");
        list5.add("e");
        List<String> list6=new ArrayList<>();
        list6.add("a");
        list6.add("a");
        List<String> list7=new ArrayList<>();
        list7.add("x");
        list7.add("x");
        queries.add(list3);
        queries.add(list4);
        queries.add(list5);
        queries.add(list6);
        queries.add(list7);
        System.out.println(Arrays.toString(new Solution().calcEquation(equations, values, queries)));
    }
}
