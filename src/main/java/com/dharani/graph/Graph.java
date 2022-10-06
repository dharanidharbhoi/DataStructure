package com.dharani.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	private Integer vertices;
	
	private LinkedList<Integer> adj[] ;
	
	public Graph(int v) {
	    this.vertices = v;
	    adj = new LinkedList[v];
	    for(int i=0;i<vertices;i++) {
	    	adj[i] = new LinkedList<>();
	    }
	}
	
	public void addEdge(int v , int w) {
		
		 adj[v].add(w);
	}
	
    // Driver method to
    public static void main(String args[])
    {
 
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
             
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
        

 
        g.BFS(2);
        
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
        
        g.DFS(2);
    }

	private void BFS(int start) {
		
		
		boolean[] visited = new boolean[vertices];
		
		visited[start] = true;
		
		
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        while(!queue.isEmpty()) {
        	Integer s = queue.poll();
        	System.out.print(s + " ");
    		LinkedList<Integer> list = adj[s];
    		
    		for(Integer i : list) {
    			if(!visited[i]) {
    				visited[i] = true;
        			queue.add(i);

    			}
    		}

        	
        }

		
		
	}
	
	private void DFS(int start) {
		
		
		boolean[] visited = new boolean[vertices];
		
		
		
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(start);
        while(!stack.isEmpty()) {
        	Integer s = stack.pop();
        	if(!visited[s]) {
        		System.out.print(s + " ");
        		visited[s] = true;
        	}
        	
        	
    		LinkedList<Integer> list = adj[s];
    		
    		for(Integer i : list) {
    			if(!visited[i]) {
        			stack.add(i);

    			}
    		}

        	
        }

		
		
	}

}
