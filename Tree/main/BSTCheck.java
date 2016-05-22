package main;

public class BSTCheck {

	public boolean checkBST(TreeNode n){
		return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean isBST(TreeNode node, int min, int max){
		if(node == null) return true;
		
		if(node.data <= min || node.data > max)
			return false;
		
		if(!isBST(node.left, min, node.data) ||
				!isBST(node.right,node.data, max))
			return false;
		
		return true;
	}
}
