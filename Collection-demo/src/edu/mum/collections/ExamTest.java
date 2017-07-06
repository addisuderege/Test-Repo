package edu.mum.collections;
import java.util.Arrays;
import java.util.List;

public class ExamTest {

	public static void main(String[] args) {
		
 List<Person> persons=Arrays.asList(
		 new Person(1,"Berhe",25),
		 new Person(2,"Hagos",30),
		 new Person(3,"Kidane",23),
		 new Person(4,"Berhane",26)
		 );
 
            print(persons);
	}

	private static void print(List<Person> persons) {
		persons.stream().forEach(System.out::println);
		
		
	}	
	
	


}

