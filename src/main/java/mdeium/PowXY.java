package mdeium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PowXY {

    public static void main(String[] args) {
        PowXY powXY = new PowXY();
//        System.out.println(powXY.myPow(2d, 10));
//        System.out.println(powXY.myPow(2d, 11));
//        System.out.println(powXY.myPow(2d, -10));
//        System.out.println(powXY.myPow(-2d, 11));
//        System.out.println(powXY.myPow(-2d, 10));
//        System.out.println(powXY.myPow(0.44528, 0));
        System.out.println(powXY.myPow(2.00000, -2147483648));
    }

    public double myPow(double x, int n) {
        if (n >= 0) {
            return pow(x, n);
        } else {
            return 1 / pow(x, Math.abs(n));
        }
    }

    private double pow(double x, long n) {
        boolean isEven = (n % 2 == 0);
        long temp = Math.abs(n);
        List<Long> calculateList = new ArrayList<>(32);
        calculateList.add(temp);
        while (temp > 1) {
            if (temp % 2 != 0) {
                temp -= 1;
            } else {
                temp /= 2;
            }
            calculateList.add(0, temp);
        }
        calculateList.add(0, 0L);
        double[] record = new double[calculateList.size()];
        record[0] = 1;
        record[1] = x;
        if (record.length > 2) {
            for (int i = 2; i < record.length; i++) {
                if (calculateList.get(i) % 2 == 0) {
                    record[i] = record[i - 1] * record[i - 1];
                } else {
                    record[i] = record[i - 1] * record[1];
                }
            }
        }
        return record[calculateList.indexOf(Math.abs(n))];
    }
//    public double myPow(double x, int n) {
//        if (n >= 0) {
//            return pow(x, n);
//        } else {
//            return 1 / pow(x, -n);
//        }
//    }
//
//    private double pow(double x, int n) {
//        if (n == 0) {
//            return 1;
//        } else if (n == 1) {
//            return x;
//        } else if (n % 2 == 0) {
//            return pow(x, n / 2) * pow(x, n / 2);
//        } else {
//            return pow(x, n - 1) * pow(x, 1);
//        }
//    }
}
