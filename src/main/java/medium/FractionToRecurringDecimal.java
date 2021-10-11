package medium;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {

    public static void main(String[] args) {
        FractionToRecurringDecimal fractionToRecurringDecimal = new FractionToRecurringDecimal();
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(1, 2));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(2, 1));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(2, 3));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(4, 333));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(1, 5));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(123, 7));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(1, 6));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(-1, -2147483648));
//        System.out.println(fractionToRecurringDecimal.fractionToDecimal(1, -2147483648));
        System.out.println(fractionToRecurringDecimal.fractionToDecimal(-2147483648, 1));
    }

    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder integerPart = new StringBuilder();
        long number = numerator;
        long denominate = denominator;
        if (number % denominate == 0) {
            return String.valueOf(number / denominate);
        }
        if (number < 0 ^ denominate < 0) {
            integerPart.append("-");
        }
        denominate = Math.abs(denominate);
        number = Math.abs(number);
        long quotient = number / denominate;
        integerPart.append(quotient).append(".");

        StringBuilder fractionPart = new StringBuilder();
        Map<Long, Integer> remainderIndexMap = new HashMap<>();
        long remainder = number % denominate;
        int index = 0;
        while (remainder != 0 && !remainderIndexMap.containsKey(remainder)) {
            remainderIndexMap.put(remainder, index);
            remainder *= 10;
            fractionPart.append(remainder / denominate);
            remainder %= denominate;
            index++;
        }
        if (remainder != 0) {
            fractionPart.insert(remainderIndexMap.get(remainder), "(");
            fractionPart.append(")");
        }

        return integerPart.append(fractionPart).toString();
    }
}
