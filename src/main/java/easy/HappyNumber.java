package easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(2));
        System.out.println(happyNumber.isHappy(19));
        System.out.println(happyNumber.isHappy(91));
        System.out.println(happyNumber.isHappy(7));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
            if (set.contains(n)) {
                break;
            }
        }
        return n == 1;
    }

}
