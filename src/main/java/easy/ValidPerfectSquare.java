package easy;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        System.out.println(validPerfectSquare.isPerfectSquare(1));
        System.out.println(validPerfectSquare.isPerfectSquare(2));
        System.out.println(validPerfectSquare.isPerfectSquare(3));
        System.out.println(validPerfectSquare.isPerfectSquare(4));
        System.out.println(validPerfectSquare.isPerfectSquare(5));
        System.out.println(validPerfectSquare.isPerfectSquare(9));
        System.out.println(validPerfectSquare.isPerfectSquare(16));
        System.out.println(validPerfectSquare.isPerfectSquare(25));
    }

    public boolean isPerfectSquare(int num) {
        int candidate = 1;
        while (num > 0) {
            num -= candidate;
            candidate += 2;
        }
        return num == 0;
    }
}
