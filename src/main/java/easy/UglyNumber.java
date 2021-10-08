package easy;

public class UglyNumber {

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        System.out.println(uglyNumber.isUgly(1));
        System.out.println(uglyNumber.isUgly(2));
        System.out.println(uglyNumber.isUgly(3));
        System.out.println(uglyNumber.isUgly(5));
        System.out.println(uglyNumber.isUgly(6));
        System.out.println(uglyNumber.isUgly(10));
        System.out.println(uglyNumber.isUgly(15));
        System.out.println(uglyNumber.isUgly(30));
        System.out.println(uglyNumber.isUgly(31));
        System.out.println(uglyNumber.isUgly(42));
        System.out.println(uglyNumber.isUgly(105));
        System.out.println(uglyNumber.isUgly(70));
    }

    public boolean isUgly(int n) {
        if(n == 1){
            return true;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
}
