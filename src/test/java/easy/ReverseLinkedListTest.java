package easy;

import easy.merge_two_sorted_lists.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }

        Assertions.assertEquals("5 4 3 2 1", reverseLinkedList.reverseList(head).toString().strip());
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }

        Assertions.assertEquals("2 1", reverseLinkedList.reverseList(head).toString().strip());
    }

    @Test
    public void test3() {
        int[] nums = new int[]{0, 1, 4, -2};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }

        Assertions.assertEquals("-2 4 1 0", reverseLinkedList.reverseList(head).toString().strip());
    }

    @Test
    public void test4() {
        Assertions.assertNull(reverseLinkedList.reverseList(null));
    }

    @Test
    public void test5() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }

        Assertions.assertEquals("5 4 3 2 1", reverseLinkedList.reverseListEffective(head).toString().strip());
    }

    @Test
    public void test6() {
        int[] nums = new int[]{1, 2};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }

        Assertions.assertEquals("2 1", reverseLinkedList.reverseListEffective(head).toString().strip());
    }

    @Test
    public void test7() {
        int[] nums = new int[]{0, 1, 4, -2};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }

        Assertions.assertEquals("-2 4 1 0", reverseLinkedList.reverseListEffective(head).toString().strip());
    }

    @Test
    public void test8() {
        Assertions.assertNull(reverseLinkedList.reverseListEffective(null));
    }
}
