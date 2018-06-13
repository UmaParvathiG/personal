package com.uma.ds.linkedlist;


public class ReverseALinkedList {


    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = previous;
            previous = current;
            current = nextTemp;
        }
        return previous;
    }
}
