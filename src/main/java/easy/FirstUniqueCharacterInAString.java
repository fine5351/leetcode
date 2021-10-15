package easy;

import java.util.*;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        System.out.println(firstUniqueCharacterInAString.firstUniqChar("leetcode"));
        System.out.println(firstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
        System.out.println(firstUniqueCharacterInAString.firstUniqChar("aabb"));
    }

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int result = -1;
        Set<Character> notUniqueSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (!notUniqueSet.contains(chars[i])) {
                boolean isUnique = true;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        notUniqueSet.add(chars[i]);
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

}
