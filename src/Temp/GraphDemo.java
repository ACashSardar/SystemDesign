package Temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphDemo {

    static class Pair {
        String v;
        int wt;

        Pair(String v, int wt) {
            this.v = v;
            this.wt = wt;
        }

//        @Override
//        public String toString() {
//            return "[" + v + ", " + wt + "] ";
//        }
    }

    public static void main(String[] args) {
        // {u, v, wt}
        // G=[{1, 2, 10}, {0, 3, 20}, {2, 3, 30}, {1, 4, 25}]; // n=5
        // node(u) -> {u, v, wt};
        List<List<Integer>> G = new ArrayList<>();

//        {"Delhi","Agra",10} , {"Bengaluru","Hyderabad",20} , {"Srinagar","Kanyakumari", 60}
        String[][] input = {{"Delhi", "Agra", "10"}, {"Bengaluru", "Hyderabad", "20"}, {"Srinagar", "Kanyakumari", "60"}};
        Map<String, List<Pair>> graph = new HashMap<>();
        for (String[] item : input) {
            String u = item[0];
            String v = item[1];
            int wt = Integer.parseInt(item[2]);
            if (!graph.containsKey(u)) {
                graph.put(u, new ArrayList<>());
            }
            graph.get(u).add(new Pair(v, wt));
        }
        System.out.println(graph);

//        // Iteration-1
//        for (Map.Entry<String, List<Pair>> itr : graph.entrySet()) {
//            String key = itr.getKey();
//            List<Pair> val = itr.getValue();
//            System.out.println(key + " " + val);
//        }
        // Iteration-2
        for (var itr : graph.entrySet()) {
            String key = itr.getKey();
            List<Pair> val = itr.getValue();
            System.out.println(key + " " + val);
        }

    }
}
