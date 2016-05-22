package main;

import java.util.ArrayList;

public class GraphNode {

	public int label;
	public ArrayList<GraphNode> neighbors;
	
	public GraphNode(int label){
		this.label = label;
		neighbors = new ArrayList<GraphNode>();
	}
}
