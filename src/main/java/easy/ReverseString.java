package easy;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] chars = "hello".toCharArray();
        reverseString.reverseString(chars);
        System.out.println(Arrays.toString(chars));
        chars = "heyo".toCharArray();
        reverseString.reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            swap(left, right, s);
            left++;
            right--;
        }
    }

    private void swap(int left, int right, char[] s) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
