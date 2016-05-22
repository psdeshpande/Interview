package test;

import static org.junit.Assert.*;
import main.BinaryTree;
import main.TreeNode;
import org.junit.Test;

public class TreeTest {

	@Test
	public void test1(){
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		tn.left.left = new TreeNode(4);
		tn.left.right = new TreeNode(5);
		tn.right.left = new TreeNode(6);
		tn.left.left.left = new TreeNode(7);
		BinaryTree bt = new BinaryTree();
		assertEquals(true,bt.isBalanced(tn));
	}
}
