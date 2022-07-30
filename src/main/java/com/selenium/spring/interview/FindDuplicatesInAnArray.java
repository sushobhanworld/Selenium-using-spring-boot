package com.selenium.spring.interview;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] a = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        findDuplicates(a);
    }

    private static void findDuplicates(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        boolean duplicate = false;
        for (int j : a) {
            if (map.containsKey(j)) {
                count = map.get(j);
                map.put(j, count + 1);
            } else {
                map.put(j, 1);
            }
        }
        System.out.println(map);
        System.out.println("------------------------------------------------------");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                duplicate = true;
            }
        }
        if (!duplicate) {
            System.out.println("No duplicates present");
        }
    }
}
