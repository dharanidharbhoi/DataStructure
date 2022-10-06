package com.dharani.graph;

import java.util.*;

public class BreadFirstSearchGraph {

	List<List<Integer>> adjList = new ArrayList<>();

	public BreadFirstSearchGraph(int vertex) {
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

		BreadFirstSearchGraph bs = new BreadFirstSearchGraph(12);
		bs.add(1, 2);
		bs.add(3, 9);
		bs.add(1, 4);
		bs.add(3, 10);
		bs.add(4, 3);
		bs.add(5, 6);
		bs.add(2, 3);
		bs.add(5, 7);
		bs.add(2, 5);
		bs.add(2, 7);
		bs.add(2, 8);

//		for(int i=1;i<bs.adjList.size();i++) {
//			
//			System.out.print("node " + i + " has vertices " );
//		bs.adjList.get(i).stream().forEach(e -> System.out.print( e + " "));
//		System.out.println();
//		
//		}

		bs.printBFSTraversing(1);
		System.out.println();
		bs.printBFSTraversing1(1);


	}

	private void printBFSTraversing(int start) {

		List<Integer> visitedList = new ArrayList<Integer>();
		List<Integer> dfsList = new ArrayList<Integer>();

		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		System.out.print(start + " ");
		dfsList.add(start);

		while (!queue.isEmpty()) {

			int node = queue.poll();

			if (visitedList.contains(node)) {
				continue;
			}

			visitedList.add(node);

			if (!adjList.get(node).isEmpty()) {

				for (int value : adjList.get(node)) {
					
                    if(!visitedList.contains(value)) {
                    	 queue.add(value);

                    }
                    if(!dfsList.contains(value)) {
                    	dfsList.add(value);
                    	System.out.print(value + " ");
                    }
				
				}

			}

		}

	}
	
	
	private void printBFSTraversing1(int start) {

		List<Integer> visitedList = new ArrayList<Integer>();

		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);

		while (!queue.isEmpty()) {

			int node = queue.poll();

			if (visitedList.contains(node)) {
				continue;
			}

			System.out.print(node +" ");
			visitedList.add(node);

			if (!adjList.get(node).isEmpty()) {

				for (int value : adjList.get(node)) {
					
                    if(!visitedList.contains(value)) {
                    	 queue.add(value);

                    }
				
				}

			}

		}

	}

}
