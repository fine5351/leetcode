package easy;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {
        AssignCookies assignCookies = new AssignCookies();
        System.out.println(assignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(assignCookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int indexG = 0;
        int indexS = 0;
        while (indexG < g.length && indexS < s.length) {
            if (g[indexG] <= s[indexS]) {
                indexG++;
            }
            indexS++;
        }
        return indexG;
    }
}
