package easy;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        int[] indexs = new int[52];
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 97;
            if (index >= 0) {
                indexs[index]++;
            } else {
                indexs[index + 32 + 26]++;
            }
        }
        int length = 0;
        int oddCount = 0;
        for (int i = 0; i < indexs.length; i++) {
            if (indexs[i] % 2 != 0) {
                oddCount++;
            }
            length += indexs[i];
        }
        return length - (oddCount > 0 ? oddCount - 1 : 0);
    }

}
