package easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println("-----------------");
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println("-----------------");
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"", "", ""}));
        System.out.println("-----------------");
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{""}));
        System.out.println("-----------------");
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println("-----------------");
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"abab", "ab", ""}));
        System.out.println("-----------------");
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        int sameCount = 0;
        boolean isSame = true;
        while (isSame) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (sameCount < strs[i].length() && sameCount < strs[i + 1].length()) {
                    isSame = isSame && strs[i].charAt(sameCount) == strs[i + 1].charAt(sameCount);
                } else {
                    isSame = false;
                }
            }
            if (isSame) {
                sameCount++;
            }
        }
        return strs[0].substring(0, sameCount);
    }
}
