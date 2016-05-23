package test;

import static org.junit.Assert.assertEquals;
import main.LowestCommanAnc;
import main.TreeNode;

import org.junit.Test;

public class LowestCommanAncTest {

	@Test
	public void test1(){
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		tn.left.left = new TreeNode(4);
		tn.left.right = new TreeNode(5);
		tn.right.left = new TreeNode(6);
		tn.left.left.left = new TreeNode(7);
		LowestCommanAnc bt = new LowestCommanAnc();
		assertEquals(tn,bt.lowestCommanAnc(tn, tn.left.left, tn.right.left));
		assertEquals(tn.left,bt.lowestCommanAnc(tn, tn.left.left, tn.left.right));
		assertEquals(null,bt.lowestCommanAnc(null, tn.left.left, tn.left.right));
		assertEquals(tn,bt.lowestCommanAnc(tn, tn, tn.left.right));
	}
}
