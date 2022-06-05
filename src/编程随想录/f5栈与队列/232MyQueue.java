package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue {

    private Deque<Integer> fStack;
    private Deque<Integer> sStack;

    public MyQueue() {
        this.fStack = new LinkedList<>();
        this.sStack = new LinkedList<>();
    }

    public void push(int x) {
        fStack.push(x);
    }

    public int pop() {
        if (fStack.isEmpty()) {
            return -1;
        }

        while (!fStack.isEmpty()) {
            sStack.push(fStack.pop());
        }

        int top = sStack.pop();
        while (!sStack.isEmpty()) {
            fStack.push(sStack.pop());
        }

        return top;
    }

    public int peek() {
        if (fStack.isEmpty()) {
            return -1;
        }

        while (!fStack.isEmpty()) {
            sStack.push(fStack.pop());
        }

        int top = sStack.peek();
        while (!sStack.isEmpty()) {
            fStack.push(sStack.pop());
        }

        return top;
    }

    public boolean empty() {
        return fStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */