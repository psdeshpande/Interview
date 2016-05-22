package test;

import static org.junit.Assert.*;
import main.BSTCheck;
import main.BinaryTree;
import main.TreeNode;

import org.junit.Test;

public class BSTCheckTest {

	@Test
	public void test1(){
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		tn.left.left = new TreeNode(4);
		tn.left.right = new TreeNode(5);
		tn.right.left = new TreeNode(6);
		tn.left.left.left = new TreeNode(7);
		BSTCheck bt = new BSTCheck();
		assertEquals(false,bt.checkBST(tn));
	}
	
	@Test
	public void test2(){
		TreeNode tn = new TreeNode(20);
		tn.left = new TreeNode(12);
		tn.right = new TreeNode(26);
		tn.left.left = new TreeNode(8);
		tn.left.right = new TreeNode(14);
		tn.right.left = new TreeNode(22);
		tn.left.left.left = new TreeNode(7);
		BSTCheck bt = new BSTCheck();
		assertEquals(true,bt.checkBST(tn));
	}
}
