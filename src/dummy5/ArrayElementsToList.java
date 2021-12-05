package dummy5;

import java.util.*;

public class ArrayElementsToList {

	public static void main(String[] args) {
		
		//Add elements of list to an Array and print them on the console
		      List<String> list1 = new ArrayList<String>();
		      list1.add("Ahmet");
		      list1.add("Hasan");
		      list1.add("Susan");
		      list1.add("Brian");
		      list1.add("Peter");
		      Object[] objArr = list1.toArray();
		      System.out.println("The array elements are: ");
		      for (Object i : objArr) {
		         System.out.println(i);
		      }
		      
		      
		      
		      List list = new ArrayList<>(Arrays.asList(objArr));
		      System.out.println("list: "+list);
	}
}
