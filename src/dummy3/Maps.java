package dummy3;

import java.util.*;
import java.util.Map.Entry;

import javafx.collections.transformation.SortedList;

public class Maps {
	
	public static void main(String[] args) {
		
		Map<String, Integer>map = new HashMap<>();
		map.put("Honda", 2021);
		map.put("Toyota", 2018);
		map.put("Porche", 2020);
		map.put("Ferrari", 2017);
		map.put("Mercedes", 2013);
		
		
		// key list
		List keyList = new ArrayList(map.keySet());
		// value list
		List valueList = new ArrayList(map.values());
		// key-value list
		List entryList = new ArrayList(map.entrySet());
		
		
		
		

//		System.out.println(entryList);
		
		
//		
		for(Entry entry: map.entrySet()) {
			  // get key
			  String key =(String) entry.getKey();
			  // get value
			  Object value = entry.getValue();
			  
			  System.out.println("key: "+key);
			  System.out.println("Value: "+value);

			}
		
		
		

	}

	
	
}
