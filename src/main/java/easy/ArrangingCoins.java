package easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrangingCoins {

    private static final Logger logger = LoggerFactory.getLogger(AddStrings.class);

    public static void main(String[] args) {
        ArrangingCoins arrangingCoins = new ArrangingCoins();
        logger.info("answer : {}", arrangingCoins.arrangeCoins(5));
        logger.info("answer : {}", arrangingCoins.arrangeCoins(8));
        logger.info("answer : {}", arrangingCoins.arrangeCoins(10));
        logger.info("answer : {}", arrangingCoins.arrangeCoins(1804289383));
    }

    public int arrangeCoins(int n) {
        return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
    }
//    public int arrangeCoins(int n) {
//        int i = 0;
//        while (2L * n >= i * (i + 1L)) {
//            i++;
//        }
//        return i - 1;
//    }
}
