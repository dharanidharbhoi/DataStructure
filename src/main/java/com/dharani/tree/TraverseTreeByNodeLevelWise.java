package com.dharani.tree;

import java.util.*;

public class TraverseTreeByNodeLevelWise {

	static Node root;

	public static void main(String[] args) {

		root = new Node(1);

		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.right = new Node(7);

		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.left.right = new Node(8);
		Map<Integer, List<Integer>> depthNodeMap = new HashMap<>();

		printByNodeLevel(root, 0, depthNodeMap);

		depthNodeMap.entrySet().stream().forEach(entry -> {

			if (entry.getKey() % 2 != 0) {

				List<Integer> list = entry.getValue();
				Collections.reverse(list);
				list.stream().forEach(e -> System.out.print(e + " "));

			} else {
				entry.getValue().stream().forEach(e -> System.out.print(e + " "));
			}

		});

	}

	private static void printByNodeLevel(Node node, int count, Map<Integer, List<Integer>> depthNodeMap) {

		if (node == null) {
			return;
		}

		List<Integer> list = depthNodeMap.get(count);

		if (list == null) {
			list = new ArrayList<>();
			list.add(node.data);
			depthNodeMap.put(count, list);
		} else {
			list.add(node.data);
		}

		if (node.left != null) {
			printByNodeLevel(node.left, count + 1, depthNodeMap);
		}

		if (node.right != null) {
			printByNodeLevel(node.right, count + 1, depthNodeMap);
		}

	}

}
