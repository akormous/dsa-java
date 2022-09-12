package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Queue {
    private ListNode head, tail;
    Queue() {
        head = null;
        tail = null;
    }
    public void push(int iVal) {
        if(head == null) {
            head = new ListNode(iVal);
            tail = head;
        } else {
            tail.next = new ListNode(iVal);
            tail = tail.next;
        }
    }

    public int front() {
        return head.val;
    }
    public int back() {
        return tail.val;
    }
    public int pop() {
        int tmp = head.val;
        head = head.next;
        return tmp;
    }

    public boolean empty() {
        return head == null;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        for(int i = 0; i < 10; i++) {
            q.push(i);
        }
        while(!q.empty()) {
            System.out.println(q.front() + " " + q.back());
            q.pop();
        }
        if(q.empty()) {
            System.out.println("Queue is empty");
        }
    }
}
