package medium;

public class ZigZagConversion {

    public static void main(String[] args) {
        ZigZagConversion solution = new ZigZagConversion();
        System.out.println(solution.convert("PAYPALISHIRING", 3));
    }

    public String convert(String s, int numRows) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int[] jumps = new int[]{(numRows - (i + 1)) * 2, i * 2};
            int pickIndex = i;
            int pickCount = 0;
            while (pickIndex < s.length()) {
                resultBuilder.append(s.charAt(pickIndex));
                if (jumps[pickCount % 2] == 0) {
                    pickCount++;
                }
                pickIndex += jumps[pickCount % 2];
                pickCount++;
            }
        }
        return resultBuilder.toString();
    }
}
