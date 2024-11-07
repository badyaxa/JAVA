package algorithm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {
    private static final Map<Character, Character> BRACKETS = new HashMap<>(Map.of(
            '}', '{',
            ']', '[',
            ')', '('
    ));

    public static void main(String[] args) {
        String[] expressions = {
                "{[()]}",
                "{[(])}",
                "{{[[(())]]}}"
        };

        for (String expression : expressions) {
            System.out.println("is " + expression + " Balanced: " + isBalanced(expression));
        }
    }

    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : expression.toCharArray()) {
            if (BRACKETS.containsValue(bracket)) {
                stack.push(bracket);
            } else if (stack.isEmpty() || !stack.pop().equals(BRACKETS.get(bracket))) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
