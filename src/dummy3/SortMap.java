package dummy3;

import java.util.*;

public class SortMap {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer>map = new HashMap<>();
		map.put("elbise", 5);
		map.put("ayakkabi", 3);
		map.put("giyisi", 3);
		
		
		List list = new ArrayList(map.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object arg0, Object arg1) {
				return arg0.toString().compareTo(arg1.toString());
			}
		

		});
		
		
		System.out.println(list);
	}

}
