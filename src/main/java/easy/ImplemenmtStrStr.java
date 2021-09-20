package easy;

import javax.swing.event.HyperlinkEvent;

public class ImplemenmtStrStr {

    public static void main(String[] args) {
        ImplemenmtStrStr implemenmtStrStr = new ImplemenmtStrStr();
//        System.out.println(implemenmtStrStr.strStr("hello", "ll"));
//        System.out.println("--------------------");
//        System.out.println(implemenmtStrStr.strStr("aaaaa", "bba"));
//        System.out.println("--------------------");
//        System.out.println(implemenmtStrStr.strStr("abbbbbb b", " "));
//        System.out.println("--------------------");
//        System.out.println(implemenmtStrStr.strStr("a", ""));
//        System.out.println("--------------------");
//        System.out.println(implemenmtStrStr.strStr("aaa", "aaaa"));
//        System.out.println("--------------------");
        System.out.println(implemenmtStrStr.strStr("mississippi", "issip"));
        System.out.println("--------------------");
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        } else if (haystack.length() >= needle.length()) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.substring(i).length() >= needle.length() && haystack.charAt(i) == needle.charAt(0)) {
                    if (haystack.substring(i, i + needle.length()).equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
