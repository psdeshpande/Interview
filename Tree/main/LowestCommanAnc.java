package main;

public class LowestCommanAnc {
	
	private boolean isLeftDescendent(TreeNode root, TreeNode p){
		if(root == null) return false;
		if(root == p) return true;
		
		return isLeftDescendent(root.left,p) || isLeftDescendent(root.right,p);
	}
	
	private TreeNode lowestCommanAncHelper(TreeNode root, TreeNode p, TreeNode q){
		if(root == null) return null;
		if(root == p || root == q) return root;
		
		boolean isPonLeft = isLeftDescendent(root.left, p);
		boolean isQonLeft = isLeftDescendent(root.left, q);
		
		if(isPonLeft != isQonLeft) return root;
		
		TreeNode child = isPonLeft ? root.left : root.right;
		return lowestCommanAncHelper(child, p, q);
	}
	
	public TreeNode lowestCommanAnc(TreeNode root, TreeNode p, TreeNode q){
		/*Check if P or Q are available in tree*/
		if(!isLeftDescendent(root, p) || !isLeftDescendent(root, q))
			return null;
		
		return lowestCommanAncHelper(root, p, q);
	}

}
