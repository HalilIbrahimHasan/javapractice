package dummy3;

import java.util.*;

public class PersonRunner {

	
	public static void main(String[] args) {
		
		Person person1 = new Person("Osman", "Yamata", 55);
		Person person2 = new Person("Ahmet", "Yurt", 4);
		Person person3 = new Person("Hakan", "Elmas", 23);
		Person person4 = new Person("Osman", "Yavan", 15);
		Person person5 = new Person("Selcuk", "Kar", 43);
		Person person6 = new Person("Nedime", "Ozgur", 24);
		
		
		//Find the names with their repeated numbers
		
		
		//Find the unique names
		
		
		//Find the oldest person
		
		//sort all ages
		
		
		
		List <Person> persons = new ArrayList<>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);

		Map<String, Integer> map = new HashMap<>();

	    for (Person p : persons)
	    {
	        if (map.containsKey(p.getName())) {
	        	
	        	int count = map.get(p.getName());
	            map.put(p.getName(), count+1);
	        } else {
	            map.put(p.getName(),1);
	        }
	   }
		
	    System.out.println(map);
	    
	    
	    Set <String> uniquePeople = new HashSet<>(map.keySet());
	    
	    System.out.println(uniquePeople);
	    
	    
	    int [] ages = new int[persons.size()];
	    
	    for (int i = 0; i < ages.length; i++) {
			ages[i] = persons.get(i).getAge();
//			System.out.println(persons.get(i).getAge());
			System.out.println(ages[i]);
		}
	    
	    Arrays.sort(ages);
	    
	    
	    System.out.println(Arrays.toString(ages));
	}
}
