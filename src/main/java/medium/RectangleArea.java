package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class RectangleArea {

    private static final Logger logger = LoggerFactory.getLogger(RectangleArea.class);

    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        System.out.println(rectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        System.out.println(rectangleArea.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
    }

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int[] xArray = new int[]{ax1, ax2, bx1, bx2};
        int[] yArray = new int[]{ay1, ay2, by1, by2};
        Arrays.sort(xArray);
        Arrays.sort(yArray);
//        logger.info("area1 : {}", area1);
//        logger.info("area2 : {}", area2);
//        logger.info("xArray : {}", Arrays.toString(xArray));
//        logger.info("yArray : {}", Arrays.toString(yArray));
        if (ax1 >= bx2 || ax2 <= bx1 || ay1 >= by2 || ay2 <= by1) {
            return area1 + area2;
        } else {
            return area1 - (xArray[2] - xArray[1]) * (yArray[2] - yArray[1]) + area2;
        }
    }
}
