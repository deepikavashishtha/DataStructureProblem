package com.datastructure.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class RadixSort {

	public void radix(final int[] input, final int digitPoistion) {
		List<LinkedList<Integer>> buckets = new ArrayList<LinkedList<Integer>>(11);
		//Adding number into buckets as per digits on digitPosistion
		System.out.println("Adding number into buckets as per digits on digitPosistion:"+digitPoistion);
		for(int number: input) {
			int digitToSort = getDigitNUmber(number, digitPoistion);
			LinkedList<Integer> currentBucket = buckets.get(digitToSort);
			if(currentBucket==null)
			{
				currentBucket = new LinkedList<>();
				buckets.add(digitToSort, currentBucket);
			}
			currentBucket.add(number);
		}
		//Loop to read buckets and update input
		int indexToArray = 0;
		for(LinkedList<Integer> currentBucket: buckets) {
			if(currentBucket !=null)
			{
				while(currentBucket.peek()!= null) {
					input[indexToArray] = currentBucket.removeFirst();
					indexToArray++;
				}
			}
		}
		System.out.println("input:"+input);
	}

	private int getDigitNUmber(final int number, final int digitPosition) {
		int divisible = 10*digitPosition;
		int result = number % divisible;
		if(result > 10)
		{
			divisible = divisible/10;
			result = result /divisible;
		}
		System.out.println("getDigitNUmber:"+result);
		return result;
	}

	public static void main(String[] args)
	{
		RadixSort radix = new RadixSort();
		int[] input = {239, 115, 75, 1189, 956, 20, 345, 7, 35, 432};
		int max = 0;
		for(int number: input) {
			if(number > max)
			{
				max = number;
			}
		}
		int maxDigit = getMaxDigit(max);
		
		for (int k=1; k<=maxDigit; k++)
		{
			radix.radix(input, k);
		}
	}

	private static int getMaxDigit(int max) {
		int maxDigit = 1;
		if(max>10)
		{
			while(max > 10)
			{
				max = max/10;
				maxDigit++;
			}
		}
		System.out.println("maxDigit:"+maxDigit);
		return maxDigit;
	}

}
