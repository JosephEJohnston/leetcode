package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

// 没思路，看答案
class MyStack {

    private Deque<Integer> fQueue;
    private Deque<Integer> sQueue;

    public MyStack() {
        fQueue = new LinkedList<>();
        sQueue = new LinkedList<>();
    }

    public void push(int x) {
        sQueue.add(x);
        while (!fQueue.isEmpty()) {
            sQueue.add(fQueue.poll());
        }

        Deque<Integer> tmp;
        tmp = fQueue;
        fQueue = sQueue;
        sQueue = tmp;
    }

    public int pop() {
        return fQueue.poll();
    }

    public int top() {
        return fQueue.peek();
    }

    public boolean empty() {
        return fQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */