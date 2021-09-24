package easy;

public class Sqrt {

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(4));
        System.out.println(sqrt.mySqrt(1));
        System.out.println(sqrt.mySqrt(8));
    }

    public int mySqrt(long x) {
        if (x == 0) {
            return 0;
        }
        long answer = x;
        while (answer * answer > x) {
            answer = (answer + x / answer) / 2;
        }
        return (int) answer;
    }

//    public int mySqrt(long x) {
//        if (x > 0) {
//            for (long i = 1; i <= x / 2 + 1; i++) {
//                long thisVal = i * i;
//                if (thisVal == x) {
//                    return (int) i;
//                } else if (thisVal < x) {
//                    long nextVal = (i + 1) * (i + 1);
//                    if (nextVal > x) {
//                        return (int) i;
//                    }
//                }
//            }
//        }
//        return 0;
//    }
}
