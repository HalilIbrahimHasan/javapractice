package dummy5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NewClassMap {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		
		
		Set set=map.entrySet();
		
		System.out.println(set);
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Entry entry = (Entry) iter.next();
			System.out.println("key: "+entry.getKey());
			System.out.println("value: "+entry.getValue());
			if(map.values().contains(entry.getValue())) {
				map.get(entry.getValue());
			}

		}
		
		
	}
}
