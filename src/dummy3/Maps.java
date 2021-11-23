package dummy3;

import java.util.*;
import java.util.Map.Entry;

import javafx.collections.transformation.SortedList;

public class Maps {
	
	public static void main(String[] args) {
		
		Map<String, Integer>map = new HashMap<>();
		map.put("elbise", 5);
		map.put("ayakkabi", 3);
		
		// key list
		List keyList = new ArrayList(map.keySet());
		// value list
		List valueList = new ArrayList(map.values());
		// key-value list
		List entryList = new ArrayList(map.entrySet());
		List <String>elements = new ArrayList<>();
		elements.add("Orhan");
		elements.add("Ahmet");
		elements.add("Yaliz");
		
		
		

//		System.out.println(entryList);
		
		
//		
//		for(Entry entry: map.entrySet()) {
//			  // get key
//			  Object key = entry.getKey();
//			  // get value
//			  Object value = entry.getValue();
//			  
//			  System.out.println("key: "+key);
//			  System.out.println("Value: "+value);
//
//			}
		
		
		

	}

	
	
}
