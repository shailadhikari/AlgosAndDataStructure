package leetcode;

import leetcode.helper.ListNode;

// 206. Reverse Linked List

public class ReverseLinkedList {
	
	    public ListNode reverseList(ListNode head) {
	        if(head == null)
	            return null;
	        ListNode next = head.next;
	        ListNode prev = null;
	        ListNode curr = head;
	        while(next != null){
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	            next = curr.next;
	        }
	        curr.next = prev;
	        
	        return curr;
	    }
}
