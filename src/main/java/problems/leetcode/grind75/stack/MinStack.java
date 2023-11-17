package problems.leetcode.grind75.stack;

import java.util.Stack;

public class MinStack {
    Stack<Entry> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        int min = Math.min(val, stack.isEmpty() ? val : stack.peek().min);
        stack.push(new Entry(val, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }

    record Entry(int value, int min) {}
}
