package leetcode;

import leetcode.helper.ListNode;

public class LinkedListCycle {
	
	public boolean hasCycle(ListNode head) {
        if(head== null || head.next==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        
        //iterate through the linked list with a slow and fast pointer to check cycle
        do{
            slow = slow.next;
            fast = fast.next;
            if(fast == null || fast.next == null || slow == null)
                return false;
            else
                fast=fast.next;
            
        }
        while(slow != fast);
        
        return true;
    }

}
