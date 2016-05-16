package main;

import main.LinkedList.ListNode;

public class PartitionLinkList {
	
	public ListNode partitionList(ListNode head, int x){
		LinkedList beforeNode = new LinkedList();
		LinkedList afterNode = new LinkedList();
		
		ListNode curr = head;
		
		while(curr!= null){
			if(curr	.data < x){
				beforeNode.insert(curr.data);
			}
			else {
				afterNode.insert(curr.data);
			}
			curr = curr.next;
		}
		
		if(beforeNode.head == null && beforeNode.end == null) 
			return afterNode.head; 
		
		ListNode beforeNodeCurr = beforeNode.head; 
		while(beforeNodeCurr.next!=null){
			beforeNodeCurr = beforeNodeCurr.next;
		}
		
		beforeNodeCurr.next = afterNode.head;
		return beforeNode.head;
	}

}
