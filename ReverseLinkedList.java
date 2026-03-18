import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> listStack = new Stack<Integer>();
        ListNode cur = head;

        while (cur != null) {
            listStack.push(cur.val);
            cur = cur.next;
        }

        ListNode newHead = null;
        ListNode current = null;

        while (!listStack.isEmpty()) {
            int val = listStack.pop();
            ListNode newNode = new ListNode(val);

            if (newHead == null) {
                newHead = newNode;
                current = newHead;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }
        return newHead;
    }

    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; };
    }

    public static void main(String[] args) {

    }
}


