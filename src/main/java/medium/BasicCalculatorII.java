package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class BasicCalculatorII {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculatorII.class);

    public static void main(String[] args) {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();
//        logger.info("{}", basicCalculatorII.calculate("3+2*2"));
//        logger.info("{}", basicCalculatorII.calculate("3+2*4"));
//        logger.info("{}", basicCalculatorII.calculate("3+4/2"));
        logger.info("{}", basicCalculatorII.calculate("42"));
    }

    public int calculate(String s) {
        long result = 0L;
        long curResult = 0L;
        int now = 0;
        char operator = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                now = now * 10 + c - '0';
            }
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == s.length() - 1) {
                if ('+' == operator) {
                    curResult += now;
                } else if ('-' == operator) {
                    curResult -= now;
                } else if ('*' == operator) {
                    curResult *= now;
                } else if ('/' == operator) {
                    curResult /= now;
                }
                if ('+' == c || '-' == c|| i == s.length() - 1) {
                    result += curResult;
                    curResult = 0;
                }
                operator = c;
                now = 0;
            }
        }
        return (int) result;
    }
//    public int calculate(String s) {
//        Stack<Integer> stack = new Stack<>();
//        int now = 0;
//        char operator = '+';
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (Character.isDigit(c)) {
//                now = now * 10 + c - '0';
//            }
//            if ((!Character.isDigit(c) &&' ' != c) || i == s.length() - 1) {
//                if ('+' == operator) {
//                    stack.push(now);
//                    logger.info("now : {}", now);
//                } else if ('-' == operator) {
//                    logger.info("now : {}", now);
//                    stack.push(now * -1);
//                } else if ('*' == operator) {
//                    int prev = stack.pop();
//                    logger.info("now : {}, prev : {}", now, prev);
//                    stack.push(prev * now);
//                } else if ('/' == operator) {
//                    int prev = stack.pop();
//                    logger.info("now : {}, prev : {}", now, prev);
//                    stack.push(prev / now);
//                }
//                operator = c;
//                now = 0;
//            }
//        }
//        int sum = 0;
//        int size = stack.size();
//        for (int i = 0; i < size; i++) {
//            sum += stack.pop();
//        }
//        return sum;
//    }

}
