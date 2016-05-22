/*Program to check if binary tree is balanced or not*/

package main;

public class BinaryTree {

	public boolean isBalanced(TreeNode root){
		if(checkHeight(root) == -1)
			return false;
		else
			return true;
	}

	public TreeNode root;
	
	private int checkHeight(TreeNode root) {
		if(root == null)
			return 0;
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1)
			return -1;
		
		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1)
			return -1;
	
		if(Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		else
			return 1+ Math.max(leftHeight, rightHeight);
	}	
}
