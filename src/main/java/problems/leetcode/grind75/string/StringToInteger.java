package problems.leetcode.grind75.string;

import java.util.Stack;

public class StringToInteger {

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int sign = 1;
        int result = 0;

        while(i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            stack.push(Character.getNumericValue(s.charAt(i)));
            i++;
        }
        i = 0;
        while(!stack.isEmpty()) {
            int number = (int) -(stack.pop() * Math.pow(10, i));
            if (overflow(result, number)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result += number;
            i++;
        }

        if (sign == 1 && result == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        return result *= -sign;
    }

    private static boolean overflow(int result, int toAdd) {
        return Integer.MIN_VALUE - result > toAdd;
    } // -7 -5
}
