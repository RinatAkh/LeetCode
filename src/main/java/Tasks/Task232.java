package Tasks;

import java.util.Stack;

public class Task232 {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public Task232() {
        this.inStack = new Stack<>();
        this.outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.empty()) {
            while(!inStack.empty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();

    }

    public int peek() {
        if(outStack.empty()) {
            while(!inStack.empty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.empty() && outStack.empty();
    }
}
