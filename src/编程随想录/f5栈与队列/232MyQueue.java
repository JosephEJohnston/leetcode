package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue {

    private final Deque<Integer> fStack;
    private final Deque<Integer> sStack;

    public MyQueue() {
        this.fStack = new LinkedList<>();
        this.sStack = new LinkedList<>();
    }

    public void push(int x) {
        fStack.push(x);
    }

    public int pop() {
        if (sStack.isEmpty()) {
            while (!fStack.isEmpty()) {
                sStack.push(fStack.pop());
            }
        }

        return sStack.pop();
    }

    public int peek() {
        int res = pop();
        sStack.push(res);

        return res;
    }

    public boolean empty() {
        return fStack.isEmpty() && sStack.isEmpty();
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