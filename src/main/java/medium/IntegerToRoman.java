package medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(3));
        System.out.println(new IntegerToRoman().intToRoman(4));
        System.out.println(new IntegerToRoman().intToRoman(9));
        System.out.println(new IntegerToRoman().intToRoman(58));
        System.out.println(new IntegerToRoman().intToRoman(1994));
    }

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int thousandBit = getThousand(num);
        int hundredBit = getHundred(num);
        int tenBit = getTen(num);
        int singleBit = getSingle(num);

        Map<Integer, String> charMap = getCharMap();

        for (int i = 0; i < getThousand(num); i++) {
            result.append(charMap.get(1000));
        }
        result.append(compose(charMap, 100, hundredBit));
        result.append(compose(charMap, 10, tenBit));
        result.append(compose(charMap, 1, singleBit));

        return result.toString();
    }

    private String compose(Map<Integer, String> charMap, int digit, int num) {
        String biggest = charMap.get(digit * 10);
        String middle = charMap.get(digit * 5);
        String smallest = charMap.get(digit);
        StringBuilder result = new StringBuilder();
        if (num >= 5) {
            if (num == 9) {
                result.append(smallest).append(biggest);
            } else {
                result.append(middle);
                for (int i = 0; i < num - 5; i++) {
                    result.append(smallest);
                }
            }
        } else if (num > 0) {
            if (num == 4) {
                result.append(smallest).append(middle);
            } else {
                for (int i = 0; i < num; i++) {
                    result.append(smallest);
                }
            }
        }
        return result.toString();
    }

    private int getThousand(int num) {
        return num / 1000;
    }

    private int getHundred(int num) {
        return (num % 1000) / 100;
    }

    private int getTen(int num) {
        return (num % 100) / 10;
    }

    private int getSingle(int num) {
        return (num % 10);
    }

    private Map<Integer, String> getCharMap() {
        Map<Integer, String> charMap = new HashMap<>();
        charMap.put(1, "I");
        charMap.put(5, "V");
        charMap.put(10, "X");
        charMap.put(50, "L");
        charMap.put(100, "C");
        charMap.put(500, "D");
        charMap.put(1000, "M");
        return charMap;
    }
}
