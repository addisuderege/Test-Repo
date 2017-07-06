package edu.mum.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amanuel","Hagos","Berihu","Kidane");
		for(String str:names){
			System.out.println(str);
		}
		
		System.out.println("\n Using Java 8 ");
		System.out.println("========================\n");
		names.stream().forEach(System.out::println);
		
		
	Class myclass=CollectionTest.class;
	System.out.println(myclass.getMethods());
		

	}
	
	
	public void display(){
		
	}

}
