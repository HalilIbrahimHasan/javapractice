package dummy5;

import java.util.*;

public class ReverseListElements {

	public static void main (String[] args) {
		//Reverse the elements of list
		
		
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(2);
	      list.add(7);
	      list.add(8);
	      list.add(3);
	      list.add(9);
	      System.out.println("Original list : " + list);
	      Collections.reverse(list); // reversing the list
	      System.out.println("Reversed list : " + list);
	   }

}
