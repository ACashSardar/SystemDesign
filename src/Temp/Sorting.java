package Temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    static class Pair {
        String name;
        int wt;

        Pair(String name, int wt) {
            this.name = name;
            this.wt = wt;
        }

        @Override
        public String toString() {
            return "[" + name + ", " + wt + "] ";
        }
    }


    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();
        list.add(new Pair("Rishav", 26));
        list.add(new Pair("Lucky", 27));
        list.add(new Pair("Akash", 25));
//        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
        Collections.sort(list, new CompareObj());
        System.out.println(list);
    }
}
