package interview.nogle;

import java.util.List;

public class MaximizingTheFinalElement {

    public static void main(String[] args) {

    }

    public static int getMaxValue(List<Integer> arr) {
        arr.sort((o1, o2) -> o1 - o2);
        if (arr.get(0) != 0) {
            arr.set(0, 1);
        }
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) - arr.get(i - 1) > 1) {
                arr.set(i, arr.get(i - 1) + 1);
            }
        }
        return arr.get(arr.size() - 1);
    }
}
