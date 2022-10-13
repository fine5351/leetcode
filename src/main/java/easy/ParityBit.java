package easy;

import java.util.Arrays;

public class ParityBit {

    public static void main(String[] args) {

        printParityBit(20);
        System.out.println("--------------------------------------------------");
        printParityBit(21);
        System.out.println("--------------------------------------------------");
        printParityBit(22);

    }

    private static void printParityBit(int input) {
        System.out.println("輸入 : " + input);
        char[] chars = Integer.toBinaryString(input).toCharArray();
        System.out.println("2進制值 : " + Arrays.toString(chars));

        int oneCount = Integer.bitCount(input);

        if (oneCount % 2 == 0) {
            System.out.println("奇同位 : " + 0);
            System.out.println("偶同位 : " + 1);
        } else {
            System.out.println("奇同位 : " + 1);
            System.out.println("偶同位 : " + 0);
        }
    }


}
