package com.lambda.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		popultaeList(personList);

		//sort person class, suppling compare method here
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getGivenName().compareTo(o2.getGivenName());
			}
		});
		System.out.println("sort person class, suppling compare method here");
		printList(personList);

		//use Lamda
		System.out.println("use lamda: sort descending first name");
		Collections.sort(personList, (Person p1, Person p2) -> p2.getGivenName().compareTo(p1.getGivenName()));
		printList(personList);

		//use Lamda
		System.out.println("use lamda: sort descending surname");
		Collections.sort(personList, (p1, p2) -> (p1.getAge() > p2.getAge())?1:0);
		printList(personList);
	}

	private static void popultaeList(List<Person> personList) {
		personList.add(new Person("abc", "d", 12));
		personList.add(new Person("a1", "a", 13));
		personList.add(new Person("a0", "c", 1));
		personList.add(new Person("bg", "re", 5));
	}

	private static void printList(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person.getGivenName() +"--"+ person.getSurName()+"--"+person.getAge());
		}
	}
}
class Person{
	private String givenName;
	private String surName;
	private int age;
	public String getGivenName() {
		return givenName;
	}
	public String getSurName() {
		return surName;
	}
	public int getAge() {
		return age;
	}
	public Person(String givenName, String surName, int age) {
		super();
		this.givenName = givenName;
		this.surName = surName;
		this.age = age;
	}
	
}
