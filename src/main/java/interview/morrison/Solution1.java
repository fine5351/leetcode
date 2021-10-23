package interview.morrison;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution1.isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (isAlphanumeric(chars[left]) && isAlphanumeric(chars[right])) {
                if (chars[left] != chars[right]) {
                    return false;
                }
                else{
                    right--;
                    left++;
                }
            } else if (isAlphanumeric(chars[left])) {
                right--;
            } else {
                left++;
            }
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
