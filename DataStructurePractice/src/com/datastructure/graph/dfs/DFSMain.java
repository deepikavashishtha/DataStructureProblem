package com.datastructure.graph.dfs;

import java.util.ArrayList;
import java.util.List;

import com.datastructure.graph.bfs.Node;

/**
 * without stack and isvisited 
 * @author edeevas
 *
 */
public class DFSMain {

	public static void main(String[] args) {
		Node root = populateGraph();
		traverseGraph(root);
	}

	private static void traverseGraph(Node currentNode) {
		int currentNodeId = currentNode.getId();
		System.out.println(currentNodeId);
		if(currentNode.getAdjacent() != null) {
			for(Node node: currentNode.getAdjacent())
			{
				traverseGraph(node);
			}
		}	
		//srack.push here and print the content of stack at the end.
		//Note that: the Node visited first will be added in the stack at last. so thats how order will be maintained
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
