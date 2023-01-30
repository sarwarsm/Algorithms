package CSCI2020;

import java.util.LinkedList;

public class Tree {
	private Node rootNode;
	private int nodeCount = 0;
	private LinkedList<Node> treeNodeList = new LinkedList<Node>();
	
	public Tree() {
		
	}
	
	public Tree(Node rootNode) {
		super();
		this.rootNode = rootNode;
		if(rootNode != null)
			this.nodeCount++;
	}

	public Node getRootNode() {
		return this.rootNode;
	}

	public void setRootnode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public int getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(int nodeCount) {
		this.nodeCount = nodeCount;
	}
	
	public void addNode(Node newNode) {
		Node node = this.rootNode;
		
		if(node == null) {
			this.rootNode = newNode;
			this.nodeCount++;
			return;
		}
		
		while(node != null) {
			if(newNode.getData().getValue() >= node.getData().getValue()) {
				if(node.getRnode() == null) {
					newNode.setPnode(node);
					node.setRnode(newNode);
					this.nodeCount++;
					break;
					
				}else {
					node = node.getRnode();
				}
			}
			else {
				if(node.getLnode() == null) {
					newNode.setPnode(node);
					node.setLnode(newNode);
					this.nodeCount++;
					break;
				}else {
					node = node.getLnode();
				}
			}
		}
	}
	
	public Node traverse(Node node) {
		if(node != null) {
			//In-Order Traversal
			traverse(node.getLnode());
			treeNodeList.add(node);
			traverse(node.getRnode());
		}
		
		return node;
	}
	
	public LinkedList<Node> getTreeNodeList(){
		this.traverse(this.rootNode);
		return this.treeNodeList;
	}
}
