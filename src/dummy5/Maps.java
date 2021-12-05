package dummy5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		SortedMap map = new TreeMap<>();
		map.put("a", "One");
		map.put("b", "Two");
		map.put("d", "Three");
		map.put("c", "Four");

		
		System.out.println(map);
		Iterator iterator = map.keySet().iterator();
		
		while(iterator.hasNext()) {
		    String key   = (String) iterator.next();

		    String value = (String) map.get(key);
		    
		    System.out.println("key: "+key);
		    System.out.println("Value: "+value);

		}
		
		
		
		
		
	}
	
	
	

	
//	Set set = 
}
