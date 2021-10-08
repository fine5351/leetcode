package easy;

public class AddDigits {

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(38));
        System.out.println(addDigits.addDigits(338));
        System.out.println(addDigits.addDigits(3388));
    }

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int mod = num % 9;
        return mod == 0 ? 9 : mod;
    }

    //    public int addDigits(int num) {
//        while (num > 9) {
//            String numString = String.valueOf(num);
//            int sum = 0;
//            char[] chars = numString.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                sum += chars[i] - '0';
//            }
//            num = sum;
//        }
//        return num;
//    }
}
