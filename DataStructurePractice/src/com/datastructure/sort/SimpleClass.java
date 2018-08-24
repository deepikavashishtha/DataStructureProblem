package com.datastructure.sort;

import java.util.List;
import java.util.Stack;

public class SimpleClass {

	int currentPosition;
	final Stack<Integer> leftSide = new Stack<>();
	final Stack<Integer> rightSide = new Stack<>();

	public SimpleClass(int n, int position) {
		for(int i =0; i< position; i++)
		{
			leftSide.push(i);
		}

		for(int i =n-1; i>position; i--)
		{
			rightSide.push(i);
		}
		currentPosition=position;
	}

	public void jumpLeft() {
		if(leftSide.size()>1){
			rightSide.push(currentPosition);
			leftSide.pop();
			currentPosition = leftSide.pop();
		}
	}

	public void jumpRight() {
		if(rightSide.size()>1){
			leftSide.push(currentPosition);
			rightSide.pop();
			currentPosition = rightSide.pop();}
	}

	public int position() {
		return currentPosition;
	}

	public static void main(String[] args) {
		SimpleClass platformer = new SimpleClass(10, 5);
		System.out.println(platformer.position());

		platformer.jumpLeft();
		System.out.println(platformer.position());

		platformer.jumpRight();
		System.out.println(platformer.position());

		platformer.jumpLeft();
		System.out.println(platformer.position());

		platformer.jumpLeft();
		System.out.println(platformer.position());

		platformer.jumpRight();
		System.out.println(platformer.position());

		platformer.jumpRight();
		System.out.println(platformer.position());

		platformer.jumpRight();
		System.out.println(platformer.position());
	}
}
