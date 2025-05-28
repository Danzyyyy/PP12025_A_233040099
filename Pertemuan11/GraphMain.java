package Pertemuan11;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        // menambahkan vertex
        g.addVertex('A'); // 0 (start for dfs)
        g.addVertex('B'); // 1
        g.addVertex('C'); // 2
        g.addVertex('D'); // 3
        g.addVertex('E'); // 4
        // menambahkan edge
        g.addEdge(0, 1); // AB
        g.addEdge(1, 2); // BC
        g.addEdge(0, 3); // AD
        g.addEdge(3, 4); // DE
        g.adjancencyMatrix();
        System.out.println();

        Graph g2 = new Graph(4);
        g2.addVertex('A'); // 0 (start for dfs)
        g2.addVertex('B'); // 1
        g2.addVertex('C'); // 2
        g2.addVertex('D'); // 3
        //edge
        g2.addEdge(0, 1); // AB
        g2.addEdge(1, 3); // BD
        g2.addEdge(3, 0); // DA
        g2.addEdge(0, 2); // AC
        g2.adjancencyMatrix();
        System.out.println();
    }
}
