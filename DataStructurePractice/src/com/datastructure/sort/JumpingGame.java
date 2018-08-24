package com.datastructure.sort;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class JumpingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 int currPos;
	    Stack<Integer> letfSide = new Stack<>();
	    Stack<Integer> rightSide = new Stack<>();

	    public void set(List<Integer> numbers, int pos) {

	        currPos = numbers.get(pos);
	        for (final Integer num : numbers.subList(0, currPos - 1)) {
	            letfSide.push(num);
	        }

	        final List<Integer> rightElems = numbers.subList(currPos + 1, numbers.size() - 1);
	        Collections.reverse(rightElems);

	        for (final Integer num : rightElems) {
	            rightSide.push(num);
	        }

	    }

	    public void jumpLeft() {
	        rightSide.push(currPos);
	        letfSide.pop();
	        currPos = letfSide.pop();
	    }

	    public void jumpRight() {
	        letfSide.push(currPos);
	        rightSide.pop();
	        currPos = rightSide.pop();
	    }
}
