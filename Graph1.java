public class Graph1 {
    private boolean adjMatrix[][];
    private int numVertices;

    public Graph1(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j) {
        // Ensure that i and j are valid vertex indices
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        } else {
            System.out.println("Invalid vertex indices");
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j]) {
                    s.append(j + " ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String args[]) {
        Graph1 g = new Graph1(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 4);
        g.addEdge(1, 3);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(4, 3);
        System.out.print(g.toString());
    }
}
// in addEdge,check to see if I and J are valid ---- in toString added a loop to go throughall adjacency matrix and print it