package easy;

public class FindTheDifference {

    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();
        System.out.println(findTheDifference.findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference.findTheDifference("", "y"));
        System.out.println(findTheDifference.findTheDifference("a", "aa"));
        System.out.println(findTheDifference.findTheDifference("ae", "aea"));
    }

    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        char result = chart[0];

        for (int i = 0; i < chars.length; i++) {
            result = (char) (result ^ chars[i]);
        }
        for (int i = 1; i < chart.length; i++) {
            result = (char) (result ^ chart[i]);
        }

        return result;
    }

//    public char findTheDifference(String s, String t) {
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        char[] chart = t.toCharArray();
//        Arrays.sort(chart);
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] != chart[i]) {
//                return chart[i];
//            }
//        }
//
//        return chart[chart.length - 1];
//    }

//    public char findTheDifference(String s, String t) {
//        char[] chars = s.toCharArray();
//        Map<Character, Integer> maps = new HashMap<>(chars.length);
//        char[] chart = t.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            int appearCount = maps.getOrDefault(chars[i], 0) + 1;
//            maps.put(chars[i], appearCount);
//        }
//        for (int i = 0; i < chart.length; i++) {
//            int appearCount = maps.getOrDefault(chart[i], 0);
//            if (appearCount == 0) {
//                return chart[i];
//            } else {
//                appearCount--;
//                maps.put(chart[i], appearCount);
//            }
//        }
//        return ' ';
//    }
}
