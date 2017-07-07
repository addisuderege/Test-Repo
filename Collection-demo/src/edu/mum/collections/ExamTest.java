package edu.mum.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamTest {
	static List<Person> persons=new ArrayList<Person>();

	public static void main(String[] args) {
		
  /*persons=Arrays.asList(
		 new Person(1,"Berhe",25),
		 new Person(2,"Hagos",30),
		 new Person(3,"Kidane",23),
		 new Person(4,"Berhane",26)
		 );
 */
            
            persons.add(new Person(1,"Berhe",25));           
            persons.add(new Person(2,"Hagos",30));
            persons.add( new Person(3,"Kidane",23));
            persons.add(new Person(4,"Mebre",40));           
            print(persons);
            
            AddPerson(new Person(5,"Belay",42));
            System.out.println("\nAfter Adding new Person ...\n");
            print(persons);
	}

	private static void print(List<Person> persons) {
		persons.stream().forEach(System.out::println);
		
		
	}	
	private static void AddPerson(Person p){
		persons.add(p);
		
	}
	
	


}

