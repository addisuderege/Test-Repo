package edu.mum.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
            persons.add(new Person(6,"Mohamed",29));
            print(persons);
            
            AddPerson(new Person(5,"Belay",42));
            System.out.println("\nAfter Adding new Person ...\n");
            print(persons);
            
        System.out.println("\n Sorting the Collections using their ages ....\n");
        System.out.println("===================================================\n");
        Collections.sort(persons,(p1,p2)->p1.getAge()-p2.getAge()); // using Comparator Java 8
          print(persons);
          System.out.println("===================================================\n");
          
          System.out.println("\n Comparing persons by First Name...\n");
          System.out.println("===================================================\n");
          Collections.sort(persons, compBy_name);
          print(persons);
          System.out.println("===================================================\n");
	}
	
	private static Comparator<Person> compBy_name=new Comparator<Person>(){

		@Override
		public int compare(Person per1, Person per2) {
			
			return per1.getFirstName().compareTo(per2.getFirstName());// Ascending Order
		}
		
	};

	private static void print(List<Person> persons) {
		persons.stream().forEach(System.out::println);
		
		
	}	
	private static void AddPerson(Person p){
		persons.add(p);
		
	}
	
	


}

