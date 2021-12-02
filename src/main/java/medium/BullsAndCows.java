package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PrintUtils;

import java.util.*;
import java.util.stream.Collectors;

public class BullsAndCows {

    private static final Logger logger = LoggerFactory.getLogger(BullsAndCows.class);

    public static void main(String[] args) {
        BullsAndCows bullsAndCows = new BullsAndCows();
        System.out.println(bullsAndCows.getHint("1807", "7810"));
        System.out.println(bullsAndCows.getHint("1123", "0111"));
        System.out.println(bullsAndCows.getHint("1", "0"));
        System.out.println(bullsAndCows.getHint("1", "1"));
        System.out.println(bullsAndCows.getHint("11", "10"));
    }

    public String getHint(String secret, String guess) {
        int indexMatchCount = 0;
        int charMatchCount = 0;
        Map<Character, Integer> notMatchSecretMap = new HashMap<>();
        List<Character> notMatchGuessList = new ArrayList<>();
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                indexMatchCount++;
            } else {
                int notMatchCount = notMatchSecretMap.getOrDefault(secret.charAt(i), 0) + 1;
                notMatchSecretMap.put(secret.charAt(i), notMatchCount);
                notMatchGuessList.add(guess.charAt(i));
            }
        }

        for (int i = 0; i < notMatchGuessList.size(); i++) {
            Character c = notMatchGuessList.get(i);
            int notMatchCount = notMatchSecretMap.getOrDefault(c, 0);
            if (notMatchCount > 0) {
                charMatchCount++;
                notMatchSecretMap.put(c, notMatchCount - 1);
            }
        }
        return indexMatchCount + "A" + charMatchCount + "B";
    }

    private boolean remove(Character targetValue, Map<Integer, Character> map) {
        Iterator<Map.Entry<Integer, Character>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Character> entry = iterator.next();
            if (entry.getValue() == targetValue) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
