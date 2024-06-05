package easy;

import java.util.Stack;

public class CustomQueueUsingTwoStacks {
    Stack<Integer> main;
    Stack<Integer> backup;

    public CustomQueueUsingTwoStacks() {
        this.main = new Stack<>();
        this.backup = new Stack<>();
    }

    public void push(int x) {
        while (!main.isEmpty()) {
            backup.push(main.pop());
        }

        main.push(x);

        while (!backup.isEmpty()) {
            main.push(backup.pop());
        }

    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.getLast();
    }

    public boolean empty() {
        return main.isEmpty();
    }

    public static void main(String[] args) {
        CustomQueueUsingTwoStacks myQueue = new CustomQueueUsingTwoStacks();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}
