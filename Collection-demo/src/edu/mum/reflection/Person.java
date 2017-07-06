package edu.mum.reflection;

public class Person {
	private String firstName;
	private int age;
	
	public static int count_persons=0;
	
	public Person(String firstName,int age){
		count_persons++;
		this.firstName=firstName;
		this.age=age;
	}
	
	public int countPersons(){
		return count_persons;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", age=" + age + "]";
	}
	
	

}
