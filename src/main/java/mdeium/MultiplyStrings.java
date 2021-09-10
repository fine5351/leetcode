package mdeium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyStrings {

    public static void main(String[] args) {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        System.out.println(multiplyStrings.multiply("1", "9"));
        System.out.println("-----");
        System.out.println(multiplyStrings.multiply("11", "9"));
        System.out.println("-----");
        System.out.println(multiplyStrings.multiply("9", "99"));
        System.out.println("-----");
        System.out.println(multiplyStrings.multiply("9133", "0"));
        System.out.println("-----");
    }

    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] answer = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                answer[i + j + 1] += mul;
            }
        }
        int carry = 0;
        for (int i = answer.length - 1; i >= 0; i--) {
            int mod = (answer[i] + carry) % 10;
            carry = (answer[i] + carry) / 10;
            answer[i] = mod;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            result.append(answer[i]);
        }
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.delete(0, 1);
        }
        return result.toString();
    }

}
