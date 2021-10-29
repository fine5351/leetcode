package interview.trendmicro;

public class Demo {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        int[] appears = new int[100_001];
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                appears[A[i]]++;
            }
        }
        for (int i = 1; i < appears.length; i++) {
            if (appears[i] == 0) {
                return i;
            }
        }
        return appears.length;
    }
}
