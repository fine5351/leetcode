package easy;

public class PowerOfFour {

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(0));
        System.out.println(powerOfFour.isPowerOfFour(1));
        System.out.println(powerOfFour.isPowerOfFour(2));
        System.out.println(powerOfFour.isPowerOfFour(3));
        System.out.println(powerOfFour.isPowerOfFour(4));
        System.out.println(powerOfFour.isPowerOfFour(5));
        System.out.println(powerOfFour.isPowerOfFour(16));
        System.out.println(powerOfFour.isPowerOfFour(64));
    }

    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        return ((n & (n - 1)) == 0) && ((n - 1) % 3 == 0);
    }

//    public boolean isPowerOfFour(int n) {
//        if (n == 0) {
//            return false;
//        }
//        while (n > 1 && n % 4 == 0) {
//            n = n / 4;
//        }
//        return n == 1;
//    }
}
