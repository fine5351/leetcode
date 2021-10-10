package medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        System.out.println(evaluateReversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evaluateReversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println(evaluateReversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            int operator = isOperator(tokens[i]);
            if (operator == 0) {
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (1 == operator) {
                    stack.push(a + b);
                } else if (2 == operator) {
                    stack.push(b - a);
                } else if (3 == operator) {
                    stack.push(a * b);
                } else if (4 == operator) {
                    stack.push(b / a);
                }
            }
        }
        return stack.pop();
    }

    private int isOperator(String token) {
        switch (token) {
            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            default:
                return 0;
        }
    }

}
