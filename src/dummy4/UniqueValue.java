package dummy4;

import java.util.*;

public class UniqueValue {

	public static void main(String[] args) {
		
		int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
		  
        //create a hashmap having integer type of key-value  
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
          
        //use for loop to pull the elements of array to hashmap's key  
        for (int j = 0; j < arrayWithDuplicates.length; j++) {   
            hashmap.put(arrayWithDuplicates[j], j);   
        }   
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
        System.out.println(hashmap.keySet());   
	}
}
