package medium;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        System.out.println(reverseWordsInAString.reverseWords("the sky is blue"));
        System.out.println(reverseWordsInAString.reverseWords("a good example"));
        System.out.println(reverseWordsInAString.reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] columns = s.trim().split(" ");
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = columns.length - 1; i >= 0; i--) {
            if(!columns[i].isEmpty()){
                resultBuilder.append(columns[i]);
                if (i != 0) {
                    resultBuilder.append(" ");
                }
            }
        }
        return resultBuilder.toString();
    }
}
