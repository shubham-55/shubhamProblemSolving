package graph;

import java.util.Scanner;

public class Graph1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Graph g = new Graph(n);

        int e = scn.nextInt();
        while (e-- > 0) {
            int src = scn.nextInt();
            int dest = scn.nextInt();
            g.addEdge(src, dest);
        }
        for(int i = 0 ; i< n; i++) {
            System.out.println(g.adj[i]);
        }
    }
}
