package easy;

public class NumberOf1Bits {

    public static void main(String[] args) {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        System.out.println(numberOf1Bits.hammingWeight(Integer.parseUnsignedInt("00000000000000000000000000001011", 2)));
        System.out.println(numberOf1Bits.hammingWeight(Integer.parseUnsignedInt("00000000000000000000000010000000", 2)));
        System.out.println(numberOf1Bits.hammingWeight(Integer.parseUnsignedInt("01111111111111111111111111110000", 2)));
        System.out.println(numberOf1Bits.hammingWeight(Integer.parseUnsignedInt("11111111111111111111111111111101", 2)));
        System.out.println(numberOf1Bits.hammingWeight(Integer.parseUnsignedInt("11111111111111111111111111111111", 2)));
    }

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}
