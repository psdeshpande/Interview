package main;

import java.util.Hashtable;

import main.LinkedList.ListNode;

public class RemoveDupFromListSol {
	
	public void removeDup(ListNode curr){
		Hashtable table = new Hashtable<>();
		ListNode prev = null;
		while (curr!=null){
			if(table.containsKey(curr.data)){
				prev.next = curr.next;
			}
			else{
				table.put(curr.data, true);
				prev = curr;
			}
			curr = curr.next;
		}
		
	}

}
