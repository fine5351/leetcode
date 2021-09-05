package fun;

public class Collatz {

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
//        collatz.collatz(1);
//        collatz.collatz(2);
//        collatz.collatz(3);
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            collatz.collatz(i);
        }
    }

    private void collatz(int input) {
        int start = input;
        int count = 1;
        while (input != 1) {
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
            count++;
        }
        System.out.println(start + " 需要 " + count + "次運算達到 421 序列");
    }
}
