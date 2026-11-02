package Programming_abstraction.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> BFS(boolean[] visited,Queue<Integer>q,int root,ArrayList<Integer>list,ArrayList<ArrayList<Integer>> adj){
        visited[root] = true;
        q.add(root);
        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);
            for(int x : adj.get(node)){
                if(!visited[x]){
                    q.add(x);
                    visited[x] = true;
                }
            }
            
        }
        return list;
    }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean []visited = new boolean[V];
        Queue<Integer> res = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        BFS(visited,res,0,list,adj);
        return list;
        
    }
}
