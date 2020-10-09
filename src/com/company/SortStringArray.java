package com.company;

import java.util.*;

public class SortStringArray {

    public List<String> sortString(String[] strings) {

        List<String> list = new ArrayList<>();
        for(String s : strings) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            list.add(new String(c));
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        SortStringArray sortStringArray = new SortStringArray();
        List<String> list = sortStringArray.sortString(new String[] {"rahul", "aman", "ambuj", "vishesh"});
        //list.forEach(System.out::println);
        System.out.println(Arrays.deepToString(list.toArray()));
    }
}
