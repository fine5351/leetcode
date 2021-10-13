package easy;

public class ReverseVowelOfAString {

    public static void main(String[] args) {
        ReverseVowelOfAString reverseVowelOfAString = new ReverseVowelOfAString();
        System.out.println(reverseVowelOfAString.reverseVowels("hello"));
        System.out.println(reverseVowelOfAString.reverseVowels("leetcode"));
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(s.length());
        while (left < right) {
            if (isVowel(chars[left]) && isVowel(chars[right])) {
                swap(left, right, chars);
                right--;
                left++;
            }
            else if(isVowel(chars[left])){
                right--;
            }
            else{
                left++;
            }
        }
        return new String(chars);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private void swap(int left, int right, char[] s) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
