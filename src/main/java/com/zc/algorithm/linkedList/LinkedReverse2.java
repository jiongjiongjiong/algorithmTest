package com.zc.algorithm.linkedList;

/**
 * linkedList Reverse
 */
public class LinkedReverse2 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        ListNode h = head;
        while (null != h) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println("\n**************************");
        ListNode resutl = reverseList(head);
        while (null != resutl) {
            System.out.print(resutl.val + " ");
            resutl = resutl.next;
        }

    }
}
