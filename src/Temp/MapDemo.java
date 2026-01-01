package Temp;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();// unsorted
//        Map<Integer, Integer> map2 = new TreeMap<>();// sorted

        Map<Sorting.Pair, Integer> tm = new TreeMap<>(new CompareObj());

        int[] arr = {1, 4, 5, 1, 2, 7, 5, 6, 4, 5, 2, 8};

        for (int elem : arr) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }

        System.out.println(map);
    }
}
