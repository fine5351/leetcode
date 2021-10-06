package easy;

public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(16));
        System.out.println(powerOfTwo.isPowerOfTwo(6));
    }

    public boolean isPowerOfTwo(int n) {
        int i = n & (n - 1);
        return (n > 0) && (i == 0);
    }

//    public boolean isPowerOfTwo(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        int count = 0;
//        for (int i = 0; i < 32; i++) {
//            count += n & 1;
//            n = n >> 1;
//        }
//        return count == 1;
//    }
}
