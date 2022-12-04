package interview.trendmicro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution3 {

    private static final Logger logger = LoggerFactory.getLogger(Solution3.class);

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
//        System.out.println(solution3.solution(new int[]{5, 3, 6, 1, 3}, 3));
//        System.out.println(solution3.solution(new int[]{3, 5, 1, 3, 9, 8}, 4));
        System.out.println(solution3.solution(new int[]{3, 5, 1, 3, 9, 8}, 2));
//        System.out.println(solution3.solution(new int[]{1, 3, 3, 5, 9, 8}, 2));
    }

    public int solution(int[] A, int K) {
        if (A == null || A.length == 0 || K > A.length - 1) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int left = i;
            int right = i + K - 1;
            if (right < A.length) {
//                logger.info("left : {}, right : {}", left, right);
//                logger.info("amplitude : {}", getAmplitude(left, right, A));
                result = Math.min(result, getAmplitude(left, right, A));
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    private int getAmplitude(int left, int right, int[] A) {
        int amplitude = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (i < left || i > right) {
                int nextIndex = i + 1;
                while (nextIndex >= left && nextIndex <= right) {
                    nextIndex++;
                }
                if (nextIndex < A.length) {
//                    logger.info("this : {}, next : {}", i, nextIndex);
                    amplitude += Math.abs(A[i] - A[nextIndex]);
                }
            }
        }
        return amplitude;
    }

}
