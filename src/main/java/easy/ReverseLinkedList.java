package easy;

import easy.merge_two_sorted_lists.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        ListNode reversed = new ListNode(nums.get(nums.size() - 1));
        ListNode current = reversed;

        for (int i = nums.size() - 2; i >= 0; i--) {
            current.next = new ListNode(nums.get(i));
            current = current.next;
        }
        return reversed;
    }

    public ListNode reverseListEffective(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}