import java.util.Stack;

class MinStack {

    Stack<int[]> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int val) {

        if (s.empty()) {
            s.push(new int[]{val, val});
        } else {
            int minVal = Math.min(val, s.peek()[1]);
            s.push(new int[]{val, minVal});
        }
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek()[0];
    }

    public int getMin() {
        return s.peek()[1];
    }
}
