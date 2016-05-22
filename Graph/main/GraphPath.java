package main;

import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class GraphPath {

	public boolean isPath(Map<Integer, GraphNode> directedGraph, GraphNode start, GraphNode end){
		
		boolean [] visited = new boolean[directedGraph.size()];
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		q.add(start);
		visited[start.label] = true;
		
		while(!q.isEmpty()){
			GraphNode node = q.remove();
			for(GraphNode child : node.neighbors){
				if(!visited[child.label]){
					if(child == end)
						return true;
					else{
						q.add(child);
						visited[child.label] = true;
					}
				}
			}
		}
		return false;
	}
}
