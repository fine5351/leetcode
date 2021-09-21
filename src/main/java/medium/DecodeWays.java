package medium;

import java.util.Arrays;

public class DecodeWays {

    public static void main(String[] args) {
        DecodeWays decodeWays = new DecodeWays();
//        System.out.println(decodeWays.numDecodings("12") == 2);
//        System.out.println("-----------------------");
//        System.out.println(decodeWays.numDecodings("226") == 3);
//        System.out.println("-----------------------");
//        System.out.println(decodeWays.numDecodings("0") == 0);
//        System.out.println("-----------------------");
//        System.out.println(decodeWays.numDecodings("06") == 0);
//        System.out.println("-----------------------");
//        System.out.println(decodeWays.numDecodings("10") == 1);
//        System.out.println("-----------------------");
//        System.out.println(decodeWays.numDecodings("101") == 1);
//        System.out.println("-----------------------");
//        System.out.println(decodeWays.numDecodings("11106") == 2);
//        System.out.println("-----------------------");
//        System.out.println(decodeWays.numDecodings("2101") == 1);
//        System.out.println("-----------------------");
        System.out.println(decodeWays.numDecodings("2201") == 1);
    }

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int[] decodeWays = new int[s.length()];
        decodeWays[0] = 1;
        for (int i = 1; i < decodeWays.length; i++) {
            decodeWays[i] = s.charAt(i) == '0' ? 0 : decodeWays[i - 1];
            if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
                if (i < 2) {
                    decodeWays[i] += 1;
                } else {
                    decodeWays[i] += decodeWays[i - 2];
                }
            }
        }
        System.out.println(Arrays.toString(decodeWays));
        return decodeWays[decodeWays.length - 1];
    }

}
