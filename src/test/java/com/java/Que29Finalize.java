package com.java;

public class Que29Finalize {
	//creating default constructor
	public Que29Finalize() {
		System.out.println("Default const...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object is destroyed");
	}
	
	public static void main(String[] args) {
		
		Que29Finalize a = new Que29Finalize();
		a = null;
		System.gc();
		
	}

}
