package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.LinkedList;
import main.RemoveDupFromListSol;

public class RemoveDupFromListSolTest {

	private RemoveDupFromListSol l1;
	@Test
	public void testString0() {
		LinkedList node = new LinkedList();
		node.insert(5);
		node.insert(6);
		node.insert(1);
		node.insert(7);
		node.insert(5);
		node.insert(1);
		node.insert(2);
		node.insert(6);
		
		l1 = new RemoveDupFromListSol();
		l1.removeDup(node.head);
		assertEquals(5,node.head.data);
		assertEquals(6,node.head.next.data);
		assertEquals(1,node.head.next.next.data);
		assertEquals(7,node.head.next.next.next.data);
		assertEquals(2,node.head.next.next.next.next.data);
	}
	
	
}
