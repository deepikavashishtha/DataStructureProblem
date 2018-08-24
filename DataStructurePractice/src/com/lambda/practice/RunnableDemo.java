package com.lambda.practice;

public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("Runnable demo");
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("first implementation");
			}
		};
		Runnable r2 = () -> System.out.println("second implementation");
		
		r1.run();
		r2.run();
	}

}
