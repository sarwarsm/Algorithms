package CSCI2020;

public class Data {
	private int value;

	public Data(int data) {
		super();
		this.value = data;
	}

	public int getValue() {
		return value;
	}

	public void setData(int data) {
		this.value = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + value + "]";
	}
	
}
