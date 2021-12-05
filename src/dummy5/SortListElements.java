package dummy5;

import java.util.*;

public class SortListElements {

	public static void main(String[] args) {
		//Sort all elements of list
		 List<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      Collections.sort(zoo);
	      System.out.println("The list after sorting is : " + zoo);
	}
}
