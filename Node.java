import java.util.Stack;

public class Node {
    int index;

    boolean isConnected(Node u) {
        // Implement Depth-First Search (DFS)
        Stack<Node> stack = new Stack<>();
        boolean[] visited = new boolean[Graph.NUM_NODES];
        stack.push(this);
        visited[this.index] = true;

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.index == u.index) {
                return true;
            }
            for (Node neighbor : Graph.adjList.get(current.index)) {
                if (!visited[neighbor.index]) {
                    stack.push(neighbor);
                    visited[neighbor.index] = true;
                }
            }
        }
        return false;
    }
}