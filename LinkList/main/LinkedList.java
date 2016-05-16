package main;

public class LinkedList {

	  // Internal helper class for a node
	  public static class ListNode {
	    public final int data;
	    public ListNode next;

	    public ListNode(int data) {
	      this.data = data;
	    }
	  }

	  public ListNode head;
	  public ListNode end;

	  public LinkedList() {
	    head = null;
	    end = null;
	  }

	  public void insert(int data) {
	    ListNode node = new ListNode(data);
	    if (head == null) {
	      head = node;
	      head.next = null;
	      end = head;
	    } else {
	      end.next = node;
	      end = end.next;
	      end.next = null;
	    }
	  }

	  public void delete(ListNode node) {
	    if (isEmpty()) {
	      return;
	    }

	    // First element of the list
	    if (node == head) {
	      head = head.next;
	      return;
	    }

	    // Intermediate and last element
	    ListNode temp = head;
	    while (temp != null) {
	      if (temp.next != null && node.data == temp.next.data) {
	        temp.next = temp.next.next;
	        return;
	      } else {
	        temp = temp.next;
	      }
	    }
	  }

	  public boolean isEmpty() {
	    return head == null;
	  }
}
