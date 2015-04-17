package edu.neu.cs5200.rest.hello;

public class HelloMessage {
	private String message;
	private int size;
	//public HelloMessage(){}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public HelloMessage(String message, int size) {
		this.message=message;
		this.size=size;
		
		// TODO Auto-generated constructor stub
	}

}
