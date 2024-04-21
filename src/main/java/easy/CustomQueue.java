package easy;

import java.util.Arrays;

public class CustomQueue {
    private int[] data;

    public CustomQueue() {
        this.data = new int[0];
    }

    public void push(int x) {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = x;
    }

    public int pop() {
        int element = data[0];
        data = Arrays.copyOfRange(data, 1, data.length);
        return element;
    }

    public int peek() {
        return data[0];
    }

    public boolean empty() {
        return data.length == 0;
    }

    @Override
    public String toString() {
        return "Queue [" + "data=" + Arrays.toString(data) + "]";
    }
}
