package easy;

public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();
        System.out.println(repeatedSubstringPattern.repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern.repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc"));
        System.out.println(repeatedSubstringPattern.repeatedSubstringPattern("abaababaab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        int length = s.length() / 2;
        while (length > 0) {
            if (s.length() % length == 0) {
                StringBuilder resultBuilder = new StringBuilder();
                int times = s.length() / length;
                String subString = s.substring(0, length);
                for (int i = 0; i < times; i++) {
                    resultBuilder.append(subString);
                }
                if (resultBuilder.toString().equals(s)) {
                    return true;
                }
            }
            length--;
        }
        return false;
    }
}
