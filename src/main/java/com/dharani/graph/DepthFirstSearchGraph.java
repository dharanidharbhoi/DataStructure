package com.dharani.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchGraph {

	List<List<Integer>> adjList = new ArrayList<>();

	public DepthFirstSearchGraph(int vertex) {
		for (int i = 1; i < vertex; i++) {

			List<Integer> list = new ArrayList<Integer>();
			adjList.add(list);
		}
	}

	private void add(int s, int d) {
		adjList.get(s).add(d);
		adjList.get(d).add(s);
	}
	
	public static void main(String[] args) {
		DepthFirstSearchGraph ds = new DepthFirstSearchGraph(12);
		ds.add(1, 2);
		ds.add(3, 9);
		ds.add(1, 4);
		ds.add(3, 10);
		ds.add(4, 3);
		ds.add(5, 6);
		ds.add(2, 3);
		ds.add(5, 7);
		ds.add(2, 5);
		ds.add(2, 7);
		ds.add(2, 8);
		
		ds.depthFirstSearch(1);

	}

	private void depthFirstSearch(int start) {
		
		
		Stack<Integer> stack = new Stack<>();
		List<Integer> visited = new ArrayList<Integer>();
		
		stack.add(start);
		
		while(!stack.isEmpty()) {
			
			int node = stack.pop();
			System.out.print(node +" ");
			if(visited.contains(node)) {
				continue;
			}
			
			visited.add(node);
			
			List<Integer> list = adjList.get(node);
			
			for(Integer a : list) {
				
				if(!visited.contains(a) && !stack.contains(a)) {
					stack.add(a);
				}
				
			}
			
			
			
			
			
		}
		
		
	}

}
