package easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberOfSegmentsInAString {

    private static final Logger logger = LoggerFactory.getLogger(AddStrings.class);

    public static void main(String[] args) {
        NumberOfSegmentsInAString numberOfSegmentsInAString = new NumberOfSegmentsInAString();
        logger.info("answer : {}", numberOfSegmentsInAString.countSegments("Hello, my name is John"));
        logger.info("answer : {}", numberOfSegmentsInAString.countSegments(", , , ,        a, eaefa"));
    }

    public int countSegments(String s) {
        int count = 0;
        boolean isStart = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !isStart) {
                isStart = true;
                count++;
            } else if (s.charAt(i) == ' ') {
                isStart = false;
            }
        }
        return count;
    }
}
