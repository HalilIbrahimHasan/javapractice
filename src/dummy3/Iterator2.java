package dummy3;

import java.util.*;
import java.util.Map.*;

public class Iterator2 {
	
	
	 public static void main(String[] arg)
	    {
		 
		 Map<String, Integer>map = new HashMap<>();
			map.put("elbise", 5);
			map.put("ayakkabi", 3);
			map.put("giyisi", 3);
			map.put("elbise", 4);
			
			Map<String, Integer>map2 =  new Hashtable<>();
			map2.put("elbise", 5);
			map2.put("ayakkabi", 3);
			map2.put("giyisi", 3);
			map2.put("elbise", 4);
			
		 Collection<Integer> myValues = map.values();
			System.out.println(myValues);//[Kemal, Ali, Veli, Aliye, Veliye, X, Z, null, K, null, L, ]
			
			//If you want to convert Map to a Collection use entrySet()
			Set<Entry<String,Integer>> setFromMap = map.entrySet();		
			for(Entry<String,Integer>w : setFromMap) {
				System.out.print(w + " ");
			}

			System.out.println(map2);
}
}