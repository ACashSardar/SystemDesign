package Temp;

import java.util.Comparator;

public class CompareObj implements Comparator<Sorting.Pair> {
    @Override
    public int compare(Sorting.Pair a, Sorting.Pair b) {
        return a.wt - b.wt;
    }
}
