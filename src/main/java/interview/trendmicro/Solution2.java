package interview.trendmicro;

public class Solution2 {

    public static void main(String[] args) {

    }

    public int solution(String S) {
        int[] bitCounts = new int[2];
        for(int i = 0; i < S.length(); i++){
            if(bitCounts[1] != 0 && S.charAt(i) == '0'){
                bitCounts[0]++;
            }
            else if(S.charAt(i) == '1'){
                bitCounts[1]++;
            }
        }

        return bitCounts[0] + (bitCounts[1] - 1) * 2 + 1;
    }

}
