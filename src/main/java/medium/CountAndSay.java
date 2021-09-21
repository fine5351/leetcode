package medium;

public class CountAndSay {

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println("result : " + countAndSay.countAndSay(1));
        System.out.println("------");
        System.out.println("result : " + countAndSay.countAndSay(2));
        System.out.println("------");
        System.out.println("result : " + countAndSay.countAndSay(3));
        System.out.println("------");
        System.out.println("result : " + countAndSay.countAndSay(4));
        System.out.println("------");
        System.out.println("result : " + countAndSay.countAndSay(5));
        System.out.println("------");
    }

    public String countAndSay(int n) {
        String result = "1";
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            char[] chars = result.toCharArray();
            char now = chars[0];
            int count = 1;
            for (int j = 1; j < chars.length; j++) {
                char temp = chars[j];
                if (now != temp) {
                    builder.append(count).append(now);
                    now = temp;
                    count = 1;
                } else {
                    count++;
                }
            }
            builder.append(count).append(now);
            result = builder.toString();
            builder.delete(0, builder.length());
        }
        return result;
    }
//    public String countAndSay(int n) {
//        if (n == 1) {
//            return "1";
//        } else {
//            String previous = countAndSay(n - 1);
//            StringBuilder result = new StringBuilder();
//            char now = previous.charAt(0);
//            int count = 1;
//            for (int i = 1; i < previous.length(); i++) {
//                char temp = previous.charAt(i);
//                if (now != temp) {
//                    result.append(count).append(now);
//                    now = temp;
//                    count = 1;
//                } else {
//                    count++;
//                }
//            }
//            result.append(count).append(now);
//            return result.toString();
//        }
//    }
}
