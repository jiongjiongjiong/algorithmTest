package com.zc.algorithm.linkedList;

/**
 * 判断链表是否有环，如果有环，环的起始下标
 * @author congzhang
 */
public class LinkedListRing2 {

    public static ListNode checkListNodeRing(ListNode head) {
        ListNode fast =head, slow = head;
        boolean flag = false;
        while(fast.next != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if (slow == fast){
               flag =  true;
               break;
           }
        }
        if (flag){
            slow = head;
            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }else {
            return null;
        }

    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(0);
        ListNode head4 = new ListNode(- 4);
//        ListNode head5 = new ListNode(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;
//        head4.next = head5;
//        head5.next = head3;

//        head.next.val = head2.val;
//        head2.next.val = head3.val;
//        head3.next.val = head4.val;
//        head4.next.val = head5.val;
        ListNode h = head;
        int i = 0;
        while (null != h) {
            System.out.print(h.val + " ");
            h = h.next;
            i++;
            if (i >= 4){
                break;
            }
        }
        System.out.println("\n**************************");
        ListNode result = checkListNodeRing(head);
        System.out.println(result.val);
    }
}
