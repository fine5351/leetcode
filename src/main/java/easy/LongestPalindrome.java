package easy;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome("ccc"));
        System.out.println(longestPalindrome.longestPalindrome("dccaccd"));
        System.out.println(longestPalindrome.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
        System.out.println(longestPalindrome.longestPalindrome("bb"));
    }

    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] allTypeChars = new int[52];
        for (char c : chars) {
            int index = c - 97;
            if (index >= 0) {
                allTypeChars[index]++;
            } else {
                allTypeChars[index + 32 + 26]++;
            }
        }
        int length = 0;
        int oddCount = 0;
        for (int charCount : allTypeChars) {
            if (charCount % 2 != 0) {
                oddCount++;
            }
            length += charCount;
        }
        return length - (oddCount > 0 ? oddCount - 1 : 0);
    }

}
