package easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Today is a nice day"));
    }

    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        int startIndex = trim.lastIndexOf(' ') + 1;
        return trim.length() - startIndex;
    }

//    public int lengthOfLastWord(String s) {
//        s = s.trim();
//        String[] split = s.split(" ");
//        return split[split.length-1].length();
//    }

}
