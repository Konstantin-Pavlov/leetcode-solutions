package easy;

import easy.merge_two_sorted_lists.ListNode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }
        int midIndex = length / 2;
        current = head;
        length = 0;
        while (current != null) {
            if (length == midIndex) {
                return current;
            }
            length++;
            current = current.next;
        }
        return new ListNode();
    }

    public static ListNode middleNodeWithArray(ListNode head) {
        ListNode current = head;
        ListNode[] nodes = new ListNode[100];
        int length = 0;
        while (current != null) {
            nodes[length] = current;
            current = current.next;
            length++;
        }
        return nodes[length / 2];
    }
}
