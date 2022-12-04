package easy;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println("--------------------");
        System.out.println(romanToInteger.romanToInt("IV"));
        System.out.println("--------------------");
        System.out.println(romanToInteger.romanToInt("IX"));
        System.out.println("--------------------");
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println("--------------------");
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
        System.out.println("--------------------");
    }

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int val1 = getValue(s.charAt(i));
            if (i < s.length() - 1) {
                int val2 = getValue(s.charAt(i + 1));
                if(val1 < val2){
                    result += val2 - val1;
                    i++;
                }
                else{
                    result += val1;
                }
            } else {
                result += val1;
            }
        }

        return result;
    }

    private Integer getValue(char roman) {
        int result = 0;
        switch (roman) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                break;
        }
        return result;
    }

//    public int romanToInt(String s) {
//        Map<String, Integer> romanMap = new HashMap<>();
//        romanMap.put("I", 1);
//        romanMap.put("IV", 4);
//        romanMap.put("V", 5);
//        romanMap.put("IX", 9);
//        romanMap.put("X", 10);
//        romanMap.put("XL", 40);
//        romanMap.put("L", 50);
//        romanMap.put("XC", 90);
//        romanMap.put("C", 100);
//        romanMap.put("CD", 400);
//        romanMap.put("D", 500);
//        romanMap.put("CM", 900);
//        romanMap.put("M", 1000);
//
//        int index = 0;
//        int result = 0;
//        while (index < s.length()) {
//            String roman;
//            if (index <= s.length() - 2) {
//                roman = s.substring(index, index + 2);
//                if (romanMap.containsKey(roman)) {
//                    index += 2;
//                } else {
//                    roman = s.substring(index, index + 1);
//                    index += 1;
//                }
//            } else {
//                roman = s.substring(index, index + 1);
//                index += 1;
//            }
//            result += romanMap.get(roman);
//        }
//        return result;
//    }
}
