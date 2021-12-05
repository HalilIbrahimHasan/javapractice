package dummy5;

import java.util.*;

public class ElementsByIndex {

	 public static void main(String args[]) throws Exception {
		 
		 //Add these fruits to their given indexes in a list
		 //The ArrayList elements are: [Apple, Melon, Mango, Grape, Banana]
		 
	      List aList = new ArrayList();
	      aList.add(0, "Apple");
	      aList.add(1, "Mango");
	      aList.add(2, "Banana");
	      aList.add(1, "Melon");
	      aList.add(3, "Grape");
	      System.out.println("The ArrayList elements are: " + aList);
	   }
}
