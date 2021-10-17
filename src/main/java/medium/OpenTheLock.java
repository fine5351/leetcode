package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {

    private static final Logger logger = LoggerFactory.getLogger(OpenTheLock.class);

    public static void main(String[] args) {
        OpenTheLock openTheLock = new OpenTheLock();
        logger.info("{}", openTheLock.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
        logger.info("{}", openTheLock.openLock(new String[]{"8888"}, "0009"));
        logger.info("{}", openTheLock.openLock(new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"}, "8888"));
        logger.info("{}", openTheLock.openLock(new String[]{"0000"}, "8888"));
    }

    public int openLock(String[] deadends, String target) {
        if (target.equals("0000")) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        for (String deadend : deadends) {
            visited.add(deadend);
        }
        if (visited.contains("0000")) {
            return -1;
        }
        int step = 0;
        queue.offer("0000");
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String now = queue.poll();
                for (int j = 0; j < now.length(); j++) {
                    String plusOne = plus(now, j);
                    String minusOne = minus(now, j);
                    if (plusOne.equals(target) || minusOne.equals(target)) {
                        return step + 1;
                    }
                    if (!visited.contains(plusOne)) {
                        visited.add(plusOne);
                        queue.offer(plusOne);
                    }
                    if (!visited.contains(minusOne)) {
                        visited.add(minusOne);
                        queue.offer(minusOne);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private String plus(String now, int index) {
        StringBuilder result = new StringBuilder(now);
        result.setCharAt(index, plusOne(result.charAt(index)));
        return result.toString();
    }

    private String minus(String now, int index) {
        StringBuilder result = new StringBuilder(now);
        result.setCharAt(index, minusOne(result.charAt(index)));
        return result.toString();
    }

    private char plusOne(char c) {
        if (c == '9') {
            return '0';
        } else {
            return (char) ((int) c + 1);
        }
    }

    private char minusOne(char c) {
        if (c == '0') {
            return '9';
        } else {
            return (char) ((int) c - 1);
        }
    }
}
