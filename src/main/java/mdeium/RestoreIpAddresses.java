package mdeium;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {

    public static void main(String[] args) {
        RestoreIpAddresses restoreIpAddresses = new RestoreIpAddresses();
        restoreIpAddresses.restoreIpAddresses("25525511135");
        restoreIpAddresses.restoreIpAddresses("0000");
        restoreIpAddresses.restoreIpAddresses("1111");
        restoreIpAddresses.restoreIpAddresses("010010");
        restoreIpAddresses.restoreIpAddresses("101023");
    }

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        backTrack(0, s, "", result);
        PrintUtils.printList(result);
        return result;
    }

    private void backTrack(int snippet, String s, String output, List<String> result) {
        if (snippet == 4 && s.isEmpty()) {
            result.add(output);
            return;
        } else {
            for (int i = 1; i < 4; i++) {
                if (s.length() < i) {
                    break;
                }
                String tryString = s.substring(0, i);
                int tryNum = Integer.valueOf(tryString);
                if (tryNum < 256 && String.valueOf(tryNum).length() == tryString.length()) {
                    backTrack(snippet + 1, s.substring(i), output + tryString + (snippet != 3 ? "." : ""), result);
                }
            }
        }
    }

}
