package Basic;

import java.util.*;
import java.util.Queue;

/**
 * Adjacency list implementation
 */
public class Graph {
    public Map<Integer, ArrayList<Integer>> adjList;
    int n;

    public Graph(int iN) {
        adjList = new HashMap<>();
        n = iN;
        for(int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }
    void dfsUtil(Integer root, boolean visited[]) {
        if(visited[root] == true) {
            return;
        }
        visited[root] = true;
        System.out.print(root + " ");
        for(Integer ngh : adjList.get(root)) {
            if(!visited[ngh]) {
                dfsUtil(ngh, visited);
            }
        }
    }
    public void dfs(Integer root) {
        System.out.println("\nDFS");
        boolean visited[] = new boolean[n];
        dfsUtil(root, visited);
    }
    public void bfs(Integer root) {
        System.out.println("\nBFS");
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n];
        q.add(root);
        visited[root] = true;

        while(!q.isEmpty()) {
            Integer cur = q.poll();
            System.out.print(cur + " ");

            for(Integer ngh : adjList.get(cur)) {
                if(!visited[ngh]) {
                    q.add(ngh);
                    visited[ngh] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.adjList.put(0, new ArrayList<Integer>(Arrays.asList(1,2,3)));
        g.adjList.put(1, new ArrayList<Integer>(Arrays.asList(2)));
        g.adjList.put(2, new ArrayList<Integer>(Arrays.asList(3)));
        g.adjList.put(3, new ArrayList<Integer>(Arrays.asList(0,1)));

        g.bfs(0);
        g.dfs(3);
    }

}
