package easy;

public class FirstBadVersion {

    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
//    public int firstBadVersion(int n) {
//        int left = 1;
//        int right = n;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)) {
//                if (!isBadVersion(mid - 1)) {
//                    return mid;
//                } else {
//                    right = mid - 1;
//                }
//            } else {
//                left = mid + 1;
//            }
//        }
//        return 0;
//    }

    private boolean isBadVersion(int version) {
        return false;
    }
}
