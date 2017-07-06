package edu.mum.collections;

public class Person {
	private int id;
	private String firstName;
	private int age;
	
	public Person(int id, String firstName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", age=" + age + "]";
	}
	
	
	

}
