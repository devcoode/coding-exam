package exam;

import java.util.Stack;

public class StackQueue<T> {

    private final Stack<T> stack1 = new Stack<>();
    private final Stack<T> stack2 = new Stack<>();

    public void put(T o) {
        stack1.push(o);
    }

    public T get() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }

        if (stack1.isEmpty()) {
            return null;
        }

        do {
            stack2.push(stack1.pop());
        }
        while (!stack1.isEmpty());

        return stack2.pop();
    }
}
