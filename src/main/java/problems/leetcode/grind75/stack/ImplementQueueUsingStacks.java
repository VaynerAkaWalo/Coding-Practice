package problems.leetcode.grind75.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    class MyQueue {
        Stack<Integer> storage = new Stack<>();
        Stack<Integer> reverse = new Stack<>();

        public MyQueue() {
            storage.empty();
            reverse.empty();
        }

        public void push(int x) {
            storage.add(x);
        }

        public int pop() {
            while (!storage.isEmpty()) {
                reverse.add(storage.pop());
            }
            int result = reverse.pop();

            while (!reverse.isEmpty()) {
                storage.push(reverse.pop());
            }
            return result;
        }

        public int peek() {
            while (!storage.isEmpty()) {
                reverse.add(storage.pop());
            }
            int result = reverse.peek();

            while (!reverse.isEmpty()) {
                storage.push(reverse.pop());
            }
            return result;
        }

        public boolean empty() {
            return storage.isEmpty();
        }
    }
}
