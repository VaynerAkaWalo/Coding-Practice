package problems.leetcode.grind75.stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(', '{', '[' -> stack.push(s.charAt(i));

                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }

                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }

                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
