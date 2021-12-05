package dummy5;

import java.util.*;

public class GetLocationOfElementList {

	
	public static void main(String[] args) {
		
		//Get the location of the given words C, F in a list
	      List aList = new ArrayList();
	      aList.add("A");
	      aList.add("B");
	      aList.add("C");
	      aList.add("D");
	      aList.add("E");
	      System.out.println("The index of element C in ArrayList is: " + aList.indexOf("C"));
	      System.out.println("The index of element F in ArrayList is: " + aList.indexOf("F"));
	   }
}
