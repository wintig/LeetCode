public class 反转链表206 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        reverseList(listNode);
        System.out.println(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return pre;
    }

    /**
     * 1 -> 2 -> 3 -> 4 -> 5
     */
    public static ListNode reverseList2(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            // 子链 2 -> 3 -> 4 -> 5
            ListNode nextTemp = curr.next;
            // curr = 1 -> null
            curr.next = prev;
            // prev = 1 -> null
            prev = curr;
            // 每一次把原来的链表切掉头部 ，例如第一次之后，
            // curr = 2 -> 3 -> 4 -> 5
            // prev = 1 ->
            curr = nextTemp;
        }

        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }
}
