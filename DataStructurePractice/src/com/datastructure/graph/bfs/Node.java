package com.datastructure.graph.bfs;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int id;
	List<Node> adjacent = new ArrayList<>();
	
	public Node(int id, List<Node> adjacent) {
		super();
		this.id = id;
		this.adjacent = adjacent;
	}

	public int getId() {
		return id;
	}

	public List<Node> getAdjacent() {
		return adjacent;
	}
	
	
	
}
