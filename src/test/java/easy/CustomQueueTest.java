package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomQueueTest {
    CustomQueue queue = new CustomQueue();

    @Test
    public void test1() {
        queue.push(2);
        queue.push(5);
        Assertions.assertEquals(2, queue.pop());
    }

    @Test
    public void test2() {
        queue.push(2);
        queue.push(5);
        queue.pop();
        Assertions.assertEquals("Queue [data=[5]]", queue.toString());
    }

    @Test
    public void test3() {
        queue.push(2);
        queue.push(5);
        queue.pop();
        queue.pop();
        Assertions.assertTrue(queue.empty());
    }

    @Test
    public void test4() {
        queue.push(2);
        queue.push(5);
        Assertions.assertEquals(2, queue.peek());
    }
}
