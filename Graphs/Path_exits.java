package Programming_abstraction.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Path_exits {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        
        for(int []edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node == dest){
                return true;
            }
            for(int n: adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        
        return false;
     }

}
