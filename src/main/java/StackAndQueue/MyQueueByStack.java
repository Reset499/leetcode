package StackAndQueue;

import java.util.Stack;

public class MyQueueByStack {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueueByStack() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpStackIn();
        return stackOut.pop();
    }

    public int peek() {
        dumpStackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.empty() && stackOut.empty();
    }

    private void dumpStackIn() {
        if (!stackOut.empty()) return;
        while (!stackIn.empty()) stackOut.push(stackIn.pop());
    }
}
