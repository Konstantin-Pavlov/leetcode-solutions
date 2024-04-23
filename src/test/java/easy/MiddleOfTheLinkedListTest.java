package easy;

import easy.merge_two_sorted_lists.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiddleOfTheLinkedListTest {
    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }
        Assertions.assertEquals("3 4 5", MiddleOfTheLinkedList.middleNode(head).toString().strip());
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }
        Assertions.assertEquals("4 5 6", MiddleOfTheLinkedList.middleNode(head).toString().strip());
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }
        Assertions.assertEquals("3 4 5", MiddleOfTheLinkedList.middleNodeWithArray(head).toString().strip());
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        ListNode node = new ListNode(nums[0]);
        ListNode head = node;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.getNext();
        }
        Assertions.assertEquals("4 5 6", MiddleOfTheLinkedList.middleNodeWithArray(head).toString().strip());
    }

}
