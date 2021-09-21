package easy;

public class LengthOfLastWord {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] split = s.split(" ");
        return split[split.length-1].length();
    }

}
