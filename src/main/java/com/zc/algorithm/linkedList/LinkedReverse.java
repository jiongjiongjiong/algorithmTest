package com.zc.algorithm.linked;

import lombok.Getter;
import lombok.Setter;

/**
 * linkedList Reverse
 */
public class LinkedReverse {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.getNext() == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = temp;

        }
        return prev;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }

        public void setNext(ListNode next) {
            this.next = next;
        }
        public ListNode getNext(){
            return next;
        }

        public int getVal(){
            return val;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head.setNext(head2);
        head2.setNext(head3);
        head3.setNext(head4);
        head4.setNext(head5);

        ListNode h = head;
        while (null != h) {
            System.out.print(h.getVal() + " ");
            h = h.getNext();
        }
        System.out.println("\n**************************");
        ListNode resutl = reverseList(head);
        while (null != resutl) {
            System.out.print(resutl.getVal() + " ");
            resutl = resutl.getNext();
        }

    }
}
