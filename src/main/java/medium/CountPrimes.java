package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PrintUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CountPrimes {

    private static final Logger logger = LoggerFactory.getLogger(CountPrimes.class);

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
//        System.out.println(countPrimes.countPrimes(5));
//        System.out.println(countPrimes.countPrimes(7));
//        System.out.println(countPrimes.countPrimes(9));
        System.out.println(countPrimes.countPrimes(5000000));
    }

    public int countPrimes(int n) {
        boolean[] isVisited = new boolean[n];
        int sqrt = (int) Math.sqrt(n);
        fill(2, isVisited);
        for (int i = 3; i <= sqrt; i += 2) {
            if (isPrime(i)) {
                fill(i, isVisited);
            }
        }
        int count = 1;
        for (int i = 3; i < isVisited.length; i += 2) {
            if (!isVisited[i]) {
                count++;
            }
        }
        return n >= 3 ? count : count - 1;
    }

    private void fill(int prime, boolean[] isVisited) {
        int next = prime + prime;
        while (next < isVisited.length) {
            isVisited[next] = true;
            next += prime;
        }
    }

    private boolean isPrime(int n) {
        if (n < 2 || n > 2 && n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        boolean isPrime = true;
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
