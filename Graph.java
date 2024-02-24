import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Graph {
    static final int NUM_NODES = 100; // Assuming a maximum of 100 nodes
    static List<List<Node>> adjList;

    boolean isConnected(Node u, Node v) {
        return u.isConnected(v);
    }
// I implemented a depth first search, to check if there is a pathway between 2 nodes
    Graph(List<Edge> L) {
        // Initialize adjacency list
        adjList = new ArrayList<>();
        for (int i = 0; i < NUM_NODES; ++i) {
            adjList.add(new ArrayList<>());
        }

        // Populate adjacency list based on edges
        for (Edge edge : L) {
            Node nodeU = new Node();
            nodeU.index = edge.u;
            Node nodeV = new Node();
            nodeV.index = edge.v;
            adjList.get(edge.u).add(nodeV);
            adjList.get(edge.v).add(nodeU);
        }
    }


   
}






