package com.company;

import java.util.HashSet;
import java.util.TreeMap;

public class UniqueOccurencess {
    public boolean uniqueOccurrences(int[] arr) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Integer value = null;
        for( int i : arr ) {
            value = map.get(i);
            if (value == null) {
                map.put(i, 1);
            } else{
                map.put(i, ++value);
            }
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();

    }

    public static void main(String[] args) {
        UniqueOccurencess uniqueOccurencess = new UniqueOccurencess();
        uniqueOccurencess.uniqueOccurrences(new int[]{1,2,2,1,1,3});
    }
}
