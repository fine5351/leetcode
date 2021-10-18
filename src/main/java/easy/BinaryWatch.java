package easy;

import utils.PrintUtils;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryWatch {

    private static final String format = "%d:%02d";

    public static void main(String[] args) {
        BinaryWatch binaryWatch = new BinaryWatch();
        List<String> result = binaryWatch.readBinaryWatch(2);
        PrintUtils.printList(result);
    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i * 64 + j) == turnedOn) {
                    list.add(String.format(format, i, j));
                }
            }
        }
        return list;
    }

//    public List<String> readBinaryWatch(int turnedOn) {
//        Set<String> result = new HashSet<>();
//        backTrack(turnedOn, new int[4], new int[6], result);
//        return result.stream().collect(Collectors.toList());
//    }
//
//    private void backTrack(int leave, int[] hourBits, int[] minuteBits, Set<String> result) {
//        if (leave == 0) {
//            int hour = 0;
//            for (int i = 0; i < hourBits.length; i++) {
//                hour += hourBits[i];
//            }
//            int minute = 0;
//            for (int i = 0; i < minuteBits.length; i++) {
//                minute += minuteBits[i];
//            }
//            if (hour < 12 && minute < 60) {
//                result.add(String.format(format, hour, minute));
//            }
//        } else {
//            for (int i = 0; i < hourBits.length; i++) {
//                if (hourBits[i] == 0) {
//                    hourBits[i] = 1 << i;
//                    backTrack(leave - 1, hourBits, minuteBits, result);
//                    hourBits[i] = 0;
//                }
//            }
//            for (int i = 0; i < minuteBits.length; i++) {
//                if (minuteBits[i] == 0) {
//                    minuteBits[i] = 1 << i;
//                    backTrack(leave - 1, hourBits, minuteBits, result);
//                    minuteBits[i] = 0;
//                }
//            }
//        }
//    }
}
