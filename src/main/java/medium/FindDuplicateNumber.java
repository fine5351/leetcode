package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindDuplicateNumber {

    private static final Logger logger = LoggerFactory.getLogger(FindDuplicateNumber.class);

    public static void main(String[] args) {
        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();
        System.out.println(findDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println(findDuplicateNumber.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        System.out.println(findDuplicateNumber.findDuplicate(new int[]{1, 1}));
        System.out.println(findDuplicateNumber.findDuplicate(new int[]{1, 1, 2}));
        System.out.println(findDuplicateNumber.findDuplicate(new int[]{2, 2, 2, 2, 2}));
    }

    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            logger.info("slow : {}, fast : {}", slow, fast);
            if (slow == fast) {
                break;
            }
        }

        fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            logger.info("slow : {}, fast : {}", slow, fast);
            if (fast == slow) {
                break;
            }
        }
        return slow;
    }

//    public int findDuplicate(int[] nums) {
//        int left = 1;
//        int right = nums.length ;
//        while (left <= right) {
//            int mid = (left + right) >> 1;
//            int count = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] <= mid) {
//                    count++;
//                }
//            }
//            if (count <= mid) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return left;
//    }

}
