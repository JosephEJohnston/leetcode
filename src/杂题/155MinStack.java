import java.util.LinkedList;

/*
class MinStack {
    LinkedList<Integer> stack = new LinkedList<>();
    LinkedList<Integer> minStack = new LinkedList<>();
    int min = Integer.MAX_VALUE;

    */
/** initialize your data structure here. *//*

    public MinStack() {

    }

    public void push(int x) {
        stack.addLast(x);
        if (minStack.isEmpty())
            min = stack.getLast();
        else
            min = Integer.min(minStack.getLast(), stack.getLast());
        minStack.addLast(min);
    }

    public void pop() {
        stack.removeLast();
        minStack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.getLast();
    }
}
*/
