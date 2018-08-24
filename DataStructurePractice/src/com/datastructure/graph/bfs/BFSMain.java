package com.datastructure.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSMain {

	public static void main(String[] args) {
		Queue<Node> queue = new LinkedList<>();
		Node root = populateGraph();
		queue.add(root);
		traverseGraph(queue);
	}

	private static void traverseGraph(  Queue<Node> queue) {
		if(queue.isEmpty())
		{
			return;
		}
		Node currentNode = queue.poll();
		int currentNodeId = currentNode.getId();
		if(currentNode.adjacent != null) {
			for(Node node: currentNode.adjacent)
			{
				System.out.println(currentNodeId+"--"+node.getId());
				queue.add(node);
			}
		}	
		traverseGraph(queue);
	}

	private static Node populateGraph() {
		Node node5 = new Node(5, null);
		List<Node> adjacent3 = new ArrayList<>();
		adjacent3.add(node5);
		Node node4 = new Node(4, adjacent3);
		List<Node> adjacent2 = new ArrayList<>();
		adjacent2.add(node4);
		Node node2 = new Node(2, adjacent2);
		Node node3 = new Node(3, null);
		List<Node> adjacent1 = new ArrayList<>();
		adjacent1.add(node2);
		adjacent1.add(node3);
		Node root = new Node(1, adjacent1);
		return root;
	}

}
