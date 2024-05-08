package medium;

import easy.merge_two_sorted_lists.ListNode;
import org.jetbrains.annotations.NotNull;

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int nodeSize = getNodeSize(head);
        if ((nodeSize == 0 || nodeSize == 1) && n == 1) {
            return null;
        }
        if (nodeSize == 2) {
            if (n == 1) {
                head.next = null;
            } else if (n == 2) {
                head = head.next;
            }
            return head;
        }
        if (nodeSize == n) {
            head = head.next;
            return head;
        }
        int index = 0;
        ListNode current = head;
        while (current != null) {
            if (index == nodeSize - n - 1) {
                current.next = current.next.next;
                break;
            }
            index++;
            current = current.next;
        }
        return head;
    }

    private static int getNodeSize(ListNode head) {
        if (head == null) {
            return 0;
        }
        if (head.next == null) {
            return 1;
        }
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static void main(String[] args) {
        ListNode node = initListNode();
        System.out.println(node);
        node = removeNthFromEnd(node, 2);
        System.out.println(node);

    }

    @NotNull
    private static ListNode initListNode() {
        int[] nums1 = {2, 3, 4, 5};
        int[] nums2 = {2};
        ListNode node = new ListNode(1);
        ListNode current = node;
        for (int num : nums2) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return node;
    }
}
