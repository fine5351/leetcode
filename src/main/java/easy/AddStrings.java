package easy;

import medium.OpenTheLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddStrings {

    private static final Logger logger = LoggerFactory.getLogger(AddStrings.class);

    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        logger.info("answer : {}", addStrings.addStrings("11", "123"));
        logger.info("answer : {}", addStrings.addStrings("99", "99"));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int length = Math.max(num1.length(), num2.length());
        int carry = 0;
        int count = 0;
        while (count < length) {
            int a = count < num1.length() ? num1.charAt(num1.length() - count - 1) - '0' : 0;
            int b = count < num2.length() ? num2.charAt(num2.length() - count - 1) - '0' : 0;
            int sum = a + b + carry;
            result.append(sum % 10);
            carry = sum / 10;
            count++;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
