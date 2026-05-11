class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class reverseLinkedlist{
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode nextNode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        a.next = b;
        b.next = c;

        ListNode head = reverseList(a);

        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}