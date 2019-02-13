package leetcode;

import leetcode.helper.ListNode;

public class IntersectionOfTwoLinkedLists {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;
        
        //maintain length to check the diff
        int lenA = 0;
        int lenB = 0;
        
        //init current nodes
        ListNode currA = headA;
        ListNode currB = headB;
        
        //move to last nodes while calculating the length
        while(currA.next != null){
            lenA++;
            currA = currA.next;
        }
        while(currB.next != null){
            lenB++;
            currB = currB.next;
        }
        
        //init the current again
        currA = headA;
        currB = headB;
        
        //move to the level position
        if(lenA > lenB)
            for(int i=0; i<lenA-lenB; i++)
                currA = currA.next;
        else if(lenB > lenA)
            for(int i=0; i<lenB-lenA; i++)
                currB = currB.next;
        
        //iterate ahead of level position to check first meeting point
        // or check if the end is reached without intersection
        while(currA != currB){
            currA = currA.next;
            currB = currB.next;
            if(currA == null)
                return null;
        }
        return currA;   
    }

}
