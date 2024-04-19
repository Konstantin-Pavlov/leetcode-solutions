package easy;

import easy.merge_two_sorted_lists.ListNode;
import easy.merge_two_sorted_lists.MergeTwoSortedLists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoListsTest {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void test0() {
//        list1 = [1,2,4], list2 = [1,3,4]
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        Assertions.assertEquals("1 1 2 3 4 4", mergeTwoSortedLists.mergeTwoLists(node1, node2).toString().strip());
    }

    @Test
    public void test1() {
//        list1 = [], list2 = []
//        ListNode node1 = new ListNode();
//        ListNode node2 = new ListNode();      

        ListNode node1 = null;
        ListNode node2 = null;
        Assertions.assertNull(mergeTwoSortedLists.mergeTwoLists(node1, node2));
    }

    @Test
    public void test2() {
//        list1 = [-9,3], list2 = [5,7]
        ListNode node1 = new ListNode(-9, new ListNode(3));
        ListNode node2 = new ListNode(5, new ListNode(7));
        Assertions.assertEquals("-9 3 5 7", mergeTwoSortedLists.mergeTwoLists(node1, node2).toString().strip());
    }
}
