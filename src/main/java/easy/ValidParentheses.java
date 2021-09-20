package easy;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
        System.out.println("--------------------------");
        System.out.println(validParentheses.isValid("()[]{}"));
        System.out.println("--------------------------");
        System.out.println(validParentheses.isValid("(]"));
        System.out.println("--------------------------");
        System.out.println(validParentheses.isValid("([)]"));
        System.out.println("--------------------------");
        System.out.println(validParentheses.isValid("{[]}"));
        System.out.println("--------------------------");
    }

    public boolean isValid(String s) {
        Stack<Character> parentheseStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLeft(c)) {
                parentheseStack.push(c);
                System.out.println("壓入 " + c);
            } else {
                if(parentheseStack.size() == 0){
                    return false;
                }
                else if (!isSameLevel(parentheseStack.peek(), c)) {
                    return false;
                } else {
                    System.out.println("彈出 "+ parentheseStack.peek());
                    parentheseStack.pop();
                }
            }
        }
        return parentheseStack.size() == 0;
    }

    private boolean isLeft(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isSameLevel(char left, char right) {
        return left == '(' && right == ')' || left == '[' && right == ']' || left == '{' && right == '}';
    }
}
