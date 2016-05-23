/* Find all the paths in tree which gives the sum*/

package main;

public class FindSumPath {
	
	private int depth(TreeNode node){
		if(node ==null) return 0;
		else
			return 1+ Math.max(depth(node.left), depth(node.right));
	}
	
	private void print(int[] path, int start, int end){
		for(int i=start;i<=end;i++)
			System.out.print(path[i] + " ");
		
		System.out.println();
	}
	
	private void findSum(TreeNode node, int[] path, int sum, int level){
		if(node == null) return;
		
		path[level] = node.data;
		int t=0;
		for(int i=level;i>=0;i--){
			t = t+path[i];
			if(t == sum)
				print(path, i, level);
		}
		
		findSum(node.left,path,sum,level+1);
		findSum(node.right,path,sum,level+1);
		
	}
	
	public void sumPath(TreeNode node, int sum){
		int depth = depth(node);
		int[] path = new int[depth];
		findSum(node, path, sum, 0);
	}

}
