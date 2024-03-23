package graph;

import java.util.ArrayList;
import java.util.Scanner;

 class Graph {
   public int n;
   public ArrayList<Integer>[] adj;

    public Graph(int n) {
        this.n = n;
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }

     public boolean hasPath(int src,int dest,boolean[] vis){
         if(src == dest) return true;
         if(vis[src] == true) return false;

         vis[src] = true;
         for(int nbr :adj[src]){
             if(hasPath(nbr,dest,vis)==true)
                 return true;
         }
         return false;
     }
 }
