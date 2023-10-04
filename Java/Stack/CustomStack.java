package Stack;

import java.util.Stack;

public class CustomStack {
    private Stack<Integer> st;
    private int max;

    public CustomStack(int maxSize) {
        st = new Stack<>();
        max = maxSize;
    }

    public void push(int x) {
        if (st.size() != max)
            st.push(x);
    }

    public int pop() {
        if (st.isEmpty())
            return -1;

        return st.pop();
    }

    public void increment(int k, int val) {
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty())
            temp.push(st.pop());

        for (int i = 0; i < k && !temp.isEmpty(); i++)
            st.push(temp.pop() + val);

        while (!temp.isEmpty())
            st.push(temp.pop());
    }
}
