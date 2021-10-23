package learn.interview.nogle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationTokens {

    public static void main(String[] args) {

    }

    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {
        if (commands == null || commands.isEmpty()) {
            return 0;
        }

        Map<Integer, Integer> tokenIdExpiryTimeMap = new HashMap<>();
        for (List<Integer> command : commands) {
            if (command.size() != 3) {
                return 0;
            }

            Integer tokenCommand = command.get(0);
            Integer tokenId = command.get(1);
            Integer tokenIdTime = command.get(2);

            if (tokenCommand == 0) {
                tokenIdExpiryTimeMap.put(tokenId, tokenIdTime + expiryLimit);
            } else {
                if (tokenIdExpiryTimeMap.containsKey(tokenId)) {
                    int tokenIdExpiryTime = tokenIdExpiryTimeMap.get(tokenId);
                    if (tokenIdTime <= tokenIdExpiryTime) {
                        tokenIdExpiryTimeMap.put(tokenId, tokenIdTime + expiryLimit);
                    } else {
                        tokenIdExpiryTimeMap.remove(tokenId);
                    }
                }
            }
        }

        Integer lastTime = commands.get(commands.size() - 1).get(2);
        return (int) tokenIdExpiryTimeMap.values().stream().filter(tokenIdTExpiryTime -> tokenIdTExpiryTime >= lastTime).count();
    }
}
