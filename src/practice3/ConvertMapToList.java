package practice3;

import java.util.*;
import java.util.Map.Entry;

public class ConvertMapToList {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Honda", 2021);
		map.put("Toyota", 2018);
		map.put("Porche", 2020);
		map.put("Ferrari", 2017);
		map.put("Mercedes", 2013);
//		System.out.println(map);
		// Print all key set and values separately on the console
		// Then print them all together

		// we are converting map data to a list
		List keyList = new ArrayList<>(map.keySet());

		System.out.println("All keys: " + keyList);

		List values = new ArrayList<>(map.values());

		System.out.println("Values: " + values);

		List allData = new ArrayList<>(map.entrySet());

		System.out.println("All data : " + allData);

		for (Entry e : map.entrySet()) {

			String key = (String) e.getKey();
			Object value = e.getValue();

			System.out.println("key: " + key);
			System.out.println("Value: " + value);

		}

	}

}
