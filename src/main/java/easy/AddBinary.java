package easy;

public class AddBinary {

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("1", "1"));
        System.out.println(addBinary.addBinary("1010", "1011"));
        System.out.println(addBinary.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int indexA = 0;
        int indexB = 0;
        int carry = 0;
        while (indexA < a.length() || indexB < b.length()) {
            int numA = 0;
            if (indexA < a.length()) {
                numA = a.charAt(a.length() - indexA - 1) - '0';
            }
            int numB = 0;
            if (indexB < b.length()) {
                numB = b.charAt(b.length() - indexB - 1) - '0';
            }
            int sum = numA + numB + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
            indexA++;
            indexB++;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }

}
