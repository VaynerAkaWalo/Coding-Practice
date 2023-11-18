package problems.leetcode.grind75.linkedlist;

public class MiddleElementOfLinkedList {

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode middle = head;
        int counter = 1;
        while (head != null) {
            if (counter % 2 == 0) {
                middle = middle.next;
            }
            head = head.next;
            counter++;
        }

        return middle;
    }
}
