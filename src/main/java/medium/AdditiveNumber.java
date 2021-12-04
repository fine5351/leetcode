package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.AbstractCollection;

public class AdditiveNumber {

    private static final Logger logger = LoggerFactory.getLogger(CombinationSumIII.class);

    public static void main(String[] args) {
        AdditiveNumber additiveNumber = new AdditiveNumber();
//        System.out.println(additiveNumber.isAdditiveNumber("112358"));
        System.out.println(additiveNumber.isAdditiveNumber("199100199"));
//        System.out.println(additiveNumber.isAdditiveNumber("1023"));
//        System.out.println(additiveNumber.isAdditiveNumber("0235813"));
//        System.out.println(additiveNumber.isAdditiveNumber("101"));
//        System.out.println(additiveNumber.isAdditiveNumber("198019823962"));
//        System.out.println(additiveNumber.isAdditiveNumber("101020305080130210"));
    }

    public boolean isAdditiveNumber(String num) {
        for (int i = 1; i < num.length(); i++) {
            String num1 = num.substring(0, i);
            if (num1.length() > 1 && '0' == num1.charAt(0)) {
                break;
            }
            for (int j = i + 1; j < num.length(); j++) {
                String num2 = num.substring(i, j);
                if (num2.length() > 1 && '0' == num2.charAt(0)) {
                    break;
                }
                if (backtrack(num1, num2, num.substring(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(String num1, String num2, String remain) {
        if ((num1.length() > 1 && '0' == num1.charAt(0)) || (num2.length() > 1 && '0' == num2.charAt(0))) {
            return false;
        }
        String sum = add(num1, num2);
        if (sum.equals(remain)) {
            return true;
        }
        if (sum.length() > remain.length() || !remain.startsWith(sum)) {
            return false;
        }
        return backtrack(num2, sum, remain.substring(sum.length()));
    }

    private String add(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int val1 = (i >= 0) ? (num1.charAt(i) - '0') : 0;
            int val2 = (j >= 0) ? (num2.charAt(j) - '0') : 0;
            int sum = val1 + val2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

}
