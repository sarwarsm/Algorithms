package CSCI2020;

public class Node implements Comparable<Node>{
	private Node lnode;
	private Node rnode;
	private Node pnode;
	private Data data;
	public Node(Node lnode, Node rnode, Data data) {
		super();
		this.lnode = lnode;
		this.rnode = rnode;
		this.data = data;
	}
	public Node() {
		super();
	}
	public Node getLnode() {
		return lnode;
	}
	public void setLnode(Node lnode) {
		this.lnode = lnode;
	}
	public Node getRnode() {
		return rnode;
	}
	public void setRnode(Node rnode) {
		this.rnode = rnode;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	public Node getPnode() {
		return pnode;
	}
	public void setPnode(Node pnode) {
		this.pnode = pnode;
	}
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		int result;
		
		if(this.data.getValue()>o.getData().getValue())
			result = 1;
		else if(this.data.getValue() == o.getData().getValue())
			result = 0;
		else
			result = -1;
		
		return result;
	}
	
	public void display() {
		System.out.println(this.data.toString());
	}
}
