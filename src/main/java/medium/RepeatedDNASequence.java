package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PrintUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequence {

    private static final Logger logger = LoggerFactory.getLogger(RepeatedDNASequence.class);

    public static void main(String[] args) {
        RepeatedDNASequence repeatedDNASequence = new RepeatedDNASequence();
//        PrintUtils.printList(repeatedDNASequence.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        PrintUtils.printList(repeatedDNASequence.findRepeatedDnaSequences("AAAAAAAAAAA"));
    }

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() > 10) {
            Set<String> hasAppearSet = new HashSet<>();
            for (int i = 0; i <= s.length() - 10; i++) {
                String slideWindow = s.substring(i, i + 10);
                logger.info("slideWindow : {}", slideWindow);
                if (hasAppearSet.contains(slideWindow) && !result.contains(slideWindow)) {
                    result.add(slideWindow);
                } else {
                    hasAppearSet.add(slideWindow);
                }
            }
        }
        return result;
    }
}
