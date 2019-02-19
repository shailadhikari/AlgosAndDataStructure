package leetcode;

import java.util.*;

import leetcode.helper.RandomListNode;

public class CopyListWithRandomPointer {
	
	
	public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return null;
        
        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<RandomListNode, RandomListNode>();
        
        RandomListNode newHead = copyRandomListHelper(head, nodeMap);
        
        return newHead;
        
    }
    
    public RandomListNode copyRandomListHelper(RandomListNode node, Map<RandomListNode, RandomListNode> nodeMap){
        if(node == null)
            return null;
        
        RandomListNode newN = new RandomListNode(node.label);
        nodeMap.put(node, newN);
        
        if(!nodeMap.containsKey(node.next))
            newN.next = copyRandomListHelper(node.next, nodeMap);
        else
            newN.next = nodeMap.get(node.next);
        
        if(!nodeMap.containsKey(node.random))
            newN.random = copyRandomListHelper(node.random, nodeMap);
        else
            newN.random = nodeMap.get(node.random);
        
        return newN;
    }

}
