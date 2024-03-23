package graph;

public class ValidPath {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g = new Graph(n);
        for(int[] edge:edges){
            g.addEdge(edge[0],edge[1]);
        }
        boolean[] vis = new boolean[n];
        return g.hasPath(source,destination,vis);
    }
}
