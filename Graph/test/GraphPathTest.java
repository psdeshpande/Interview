package test;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import main.GraphNode;
import main.GraphPath;

public class GraphPathTest {
	
	 
	 @Test
	  public void test() {
		GraphPath graphPath = new GraphPath(); 
	    GraphNode zero = new GraphNode(0);
	    GraphNode one = new GraphNode(1);
	    GraphNode two = new GraphNode(2);
	    GraphNode three = new GraphNode(3);
	    GraphNode four = new GraphNode(4);
	    GraphNode five = new GraphNode(5);
	    GraphNode six = new GraphNode(6);
	    GraphNode seven = new GraphNode(7);
	    GraphNode eight = new GraphNode(8);

	    zero.neighbors.add(one);
	    zero.neighbors.add(eight);
	    one.neighbors.add(zero);
	    two.neighbors.add(three);
	    two.neighbors.add(four);
	    two.neighbors.add(five);
	    two.neighbors.add(eight);
	    three.neighbors.add(two);
	    four.neighbors.add(two);
	    four.neighbors.add(seven);
	    five.neighbors.add(two);
	    five.neighbors.add(six);
	    six.neighbors.add(five);
	    six.neighbors.add(seven);
	    six.neighbors.add(eight);
	    seven.neighbors.add(four);
	    seven.neighbors.add(six);
	    eight.neighbors.add(two);
	    eight.neighbors.add(six);
	    eight.neighbors.add(zero);

	    Map<Integer, GraphNode> directedGraph = new HashMap<Integer, GraphNode>();
	    directedGraph.put(0, zero);
	    directedGraph.put(1, one);
	    directedGraph.put(2, two);
	    directedGraph.put(3, three);
	    directedGraph.put(4, four);
	    directedGraph.put(5, five);
	    directedGraph.put(6, six);
	    directedGraph.put(7, seven);
	    directedGraph.put(8, eight);

	    assertEquals(true,graphPath.isPath(directedGraph, eight, five));
	    GraphNode nine = new GraphNode(9);
	    assertEquals(false,graphPath.isPath(directedGraph, zero, nine));
	  }

}
