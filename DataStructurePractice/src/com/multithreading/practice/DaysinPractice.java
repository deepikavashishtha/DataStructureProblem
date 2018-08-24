package com.multithreading.practice;

import java.util.HashMap;
import java.util.Map;

public class DaysinPractice {
	public static void main(String[] args)
	{
		Map<String, String> myMap = new HashMap<>();
		myMap.put("key1", "dsklfksdfsdifhsdih");
		myMap.put("key2", "dsklfksdfsdifhsdih");
		myMap.put("key3", "dsklfksdfsdifhsdih");
		myMap.put("key4", "dsklfksdfsdifhsdih");
		myMap.put("key5", "dsklfksdfsdifhsdih");
		myMap.put("key6", "dsklfksdfsdifhsdih");
		myMap.put("key7", "dsklfksdfsdifhsdih");
		myMap.put("key8", "dsklfksdfsdifhsdih");
		System.out.println(myMap);
		System.out.println( Thread.currentThread().getContextClassLoader()    );
	}
}
