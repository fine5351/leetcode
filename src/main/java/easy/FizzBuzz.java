package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {
        String[] arrays = new String[]{"Fizz", "Buzz", "FizzBuzz"};
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add(arrays[2]);
            } else if (i % 3 == 0) {
                result.add(arrays[0]);
            } else if (i % 5 == 0) {
                result.add(arrays[1]);
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
