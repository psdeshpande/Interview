package main;

public class InorderSucc {
	
	public static class TreeNode {
		int data;
		public TreeNode left;
		public TreeNode right;
		public TreeNode parent;
		
		public TreeNode(int data){
			this.data = data;
			left = right = parent =null;
		}
	}

	/*parent pointer is given*/
	public TreeNode inorderSucc(TreeNode node){
		if(node == null) return null;
		
		if(node.right!=null)
			return leftMost(node.right);
		else {
			TreeNode q = node;
			TreeNode x = q.parent;
			while(x!=null && x.left!=q){
				q=x;
				x=x.parent;
			}
			return x;
		}
	}

	private TreeNode leftMost(TreeNode n){
		if(n==null) return null;
		
		while(n.left!=null)
			n=n.left;
		return n;
	}
	
	/*parent pointer is not given*/
	public TreeNode inorderSuccNoParent(TreeNode node, TreeNode root){
		if(node == null) return null;
		if(node.right!=null)
			return leftMost(node.right);
		
		TreeNode succ = null;
		while(root!=null){
			if(root.data > node.data){
				succ = root;
				root = root.left;
			}
			else if(root.data < node.data)
				root = root.right;
			else 
				break;
		}
		return succ;
	}
	}
}
