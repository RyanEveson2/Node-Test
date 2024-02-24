import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class GraphTest {

	@Test
	void testIsConnected() {
		Node node1 = new Node();
        node1.index = 1;
        Node node2 = new Node();
        node2.index = 2;
        Node node3 = new Node();
        node3.index = 3;
        Node node4 = new Node();
        node3.index = 4;
        Node node7 = new Node();
        node3.index = 7;
        Edge edge1 = new Edge(1, 2);
        Edge edge2 = new Edge(2, 3);
        Edge edge3 = new Edge(4,7);
        List<Edge> edges = Arrays.asList(edge1, edge2,edge3);
        Graph graph = new Graph(edges);
   
      boolean ExpectedTrue = true;
      boolean ExpectedFalse = false;      
      assertEquals(node1.isConnected(node2),ExpectedTrue);
      assertEquals(node1.isConnected(node7), ExpectedFalse);
        
	}

}
