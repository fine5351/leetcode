package easy;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] appearCount = new int[26];
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        for (int i = 0; i < magazineChars.length; i++) {
            appearCount[magazineChars[i] - 'a']++;
        }

        for (int i = 0; i < ransomNoteChars.length; i++) {
            appearCount[ransomNoteChars[i] - 'a']--;
            if (appearCount[ransomNoteChars[i] - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
