package easy.merge_two_sorted_lists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        ListNode cur1 = node1;
        ListNode cur2 = node2;

        ListNode resultNode;

        if (cur1.val <= cur2.val) {
            resultNode = new ListNode(cur1.val);
            cur1 = cur1.next;
        } else {
            resultNode = new ListNode(cur2.val);
            cur2 = cur2.next;
        }

        ListNode resultNodeHead = resultNode;

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                resultNode.next = new ListNode(cur1.val);
                cur1 = cur1.next;
            } else {
                resultNode.next = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
            resultNode = resultNode.next;
        }

        resultNode.next = cur1 != null ? cur1 : cur2; //new ListNode(cur2.val);
        return resultNodeHead;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode resultNode;
        System.out.println(node1);
        System.out.println(node2);

        ListNode cur1 = node1;
        ListNode cur2 = node2;

        if (cur1.val <= cur2.val) {
            resultNode = new ListNode(cur1.val);
            cur1 = cur1.next;
        } else {
            resultNode = new ListNode(cur2.val);
            cur2 = cur2.next;
        }

        ListNode resultNodeHead = resultNode;

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                resultNode.next = new ListNode(cur1.val);
                cur1 = cur1.next;
            } else {
                resultNode.next = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
            resultNode = resultNode.next;
        }

        resultNode.next = cur1 != null ? new ListNode(cur1.val) : new ListNode(cur2.val);

//        while (cur1 != null) {
//            System.out.println(cur1.val);
//            cur1 = cur1.next;
//        }
        while (resultNodeHead != null) {
            System.out.print(resultNodeHead.val + " ");
            resultNodeHead = resultNodeHead.next;
        }
    }

    private String getStringNode(ListNode node) {
        StringBuilder stringBuilder = new StringBuilder("[");
        while (node != null) {
            stringBuilder.append(node.val).append(", ");
            node = node.next;
        }
        stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "]");
        return stringBuilder.toString();
    }

}

class listNodeIterator {
    private ListNode listNode;

    public listNodeIterator(ListNode listNode) {
        this.listNode = listNode;
    }

    public boolean hasNext() {
        return listNode.next != null;
    }

    public ListNode next() {
        return null;
    }
}

