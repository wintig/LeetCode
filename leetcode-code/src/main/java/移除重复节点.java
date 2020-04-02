public class 移除重复节点 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(2);
        listNode.next.next.next.next.next = new ListNode(1);
        removeDuplicateNodes(listNode);
        System.out.println(listNode);
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        int[] arr = new int[20000];

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        while (dummyHead.next != null) {
            if (++arr[dummyHead.next.val] > 1) {
                dummyHead.next = dummyHead.next.next;
            } else {
                dummyHead = dummyHead.next;
            }
        }
        return head;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }

}
