package com.zc.algorithm.linkedList;

public class LinkedListSwapPairs {

    public static ListNode swapPairs(ListNode head) {
//        ListNode a,b,temp;
//        ListNode dummy =new ListNode(0);
//        dummy.next = head;
//        ListNode pre = dummy;
//        while(pre.next != null && pre.next.next != null){
//            a = pre.next;
//            b = a.next;
//            pre.next = b;
//            temp = b.next;
//            b.next = a;
////            a.next = b.next;
//            a.next = temp;
//            pre = a;

        ListNode dummy =new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(pre.next != null && pre.next.next != null){
            ListNode a = pre.next;
            ListNode b = a.next;
            pre.next = b;
            //方法一
            a.next = b.next;
            b.next = a;
            //方法二
//            ListNode temp = b.next;
//            b.next = a;
//            a.next = b.next;
//            a.next = temp;
            pre = a;
        }
        return dummy.next;
//        ListNode dummyead = new ListNode(0);
//        dummyead.next = head;
//        ListNode p = dummyead;
//        while(p.next != null && p.next.next != null) {
//            ListNode node1 = p.next;
//            ListNode node2 = node1.next;
//            ListNode next = node2.next;
//
//            node2.next = node1;
//            node1.next = next;
//            p.next = node2;
//
//            p = node1;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
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

//        head.next.val = head2.val;
//        head2.next.val = head3.val;
//        head3.next.val = head4.val;
//        head4.next.val = head5.val;

        ListNode resutl = swapPairs(head);
        while (null != resutl) {
            System.out.print(resutl.val + " ");
            resutl = resutl.next;
        }
    }
}
