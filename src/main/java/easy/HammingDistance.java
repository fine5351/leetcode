package easy;

public class HammingDistance {

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(1, 4));
        System.out.println(hammingDistance.hammingDistance(3, 1));
    }

    public int hammingDistance(int x, int y) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (x & 1) ^ (y & 1);
            x = x >> 1;
            y = y >> 1;
        }
        return count;
    }

}
