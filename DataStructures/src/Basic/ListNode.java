package Basic;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode() {
        val = -1;
    }
    public ListNode(int iVal) {
        val = iVal;
    }
    public ListNode(int iVal, ListNode iNext) {
        val = iVal;
        next = iNext;
    }
}
