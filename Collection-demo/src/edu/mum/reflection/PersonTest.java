package edu.mum.reflection;

import java.lang.reflect.Field;

public class PersonTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person p1=new Person("Amanuel",28);
		Person p2=new Person("Hagos",30);
		Person p3=new Person("Abel",27);
		
		System.out.println("Number of Person Objects created: "+Person.count_persons);
		
		/*try {
			System.out.println(Person.class.getDeclaredField("count_persons"));
		} 
		catch (NoSuchFieldException | SecurityException e) 
		{
			
			e.printStackTrace();
		}*/
		
		
		//Accessing private members of person class using Reflection API
		System.out.println("\n Accessing private members using Reflection\n");
		try{
			Field field1=p3.getClass().getDeclaredField("firstName");
			field1.setAccessible(true);
			System.out.println(field1.get(p3));
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
