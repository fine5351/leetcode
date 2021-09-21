package medium;

public class StringToIntegerAtoi {

    public static void main(String[] args) {
        System.out.println(new StringToIntegerAtoi().myAtoi("3.14159"));
        System.out.println(new StringToIntegerAtoi().myAtoi("   -42"));
        System.out.println(new StringToIntegerAtoi().myAtoi("  -0012a42"));
        System.out.println(new StringToIntegerAtoi().myAtoi("+-12"));
        System.out.println(new StringToIntegerAtoi().myAtoi("-+12"));
        System.out.println(new StringToIntegerAtoi().myAtoi("1"));
        System.out.println(new StringToIntegerAtoi().myAtoi("200000000000000000000000000000000000000000000"));
    }

    // 0~9 48~57 +:43 -:45
    public int myAtoi(String s) {
        String firstString = s.trim().split(" ")[0];
        char[] chars = firstString.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();
        if (chars.length < 2) {
            if (chars.length == 0 || !isNumber(chars[0])) {
                return 0;
            } else {
                return Integer.parseInt(String.valueOf(chars[0]));
            }
        }
        if ((isNumber(chars[0]) || isSign(chars[0]))) {
            if (chars[0] != '+') {
                resultBuilder.append(chars[0]);
            }
            for (int i = 1; i < chars.length; i++) {
                if (isNumber(chars[i])) {
                    resultBuilder.append(chars[i]);
                } else {
                    break;
                }
            }
            if (resultBuilder.length() == 0 || resultBuilder.toString().equals("-")) {
                return 0;
            }
            return parse(resultBuilder.toString());
        }
        return 0;
    }

    private boolean isNumber(char c) {
        return 48 <= (int) c && (int) c <= 57;
    }

    private boolean isSign(char c) {
        return (int) c == 43 || (int) c == 45;
    }

    private int parse(String s){
        int result;
        try {
            result = Integer.parseInt(s);
        }
        catch (Exception e){
            if(s.charAt(0) == '-'){
                result = Integer.MIN_VALUE;
            }
            else{
                result = Integer.MAX_VALUE;
            }
        }
        return result;
    }

}