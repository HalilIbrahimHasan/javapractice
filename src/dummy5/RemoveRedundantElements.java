package dummy5;

import java.util.*;

public class RemoveRedundantElements {

	public static void main(String[] args){
	      //Instantiating an ArrayList object
	      ArrayList<String> list = new ArrayList<String>();
	      list.add("JavaFX");
	      list.add("Java");
	      list.add("JavaFX");
	      list.add("OpenCV");
	      list.add("Java");
	      list.add("JOGL");
	      list.add("JOGL");
	      list.add("HBase");
	      list.add("Flume");
	      list.add("HBase");
	      list.add("Impala");
	      System.out.println("Contents of the Array List : \n"+list);
	      //Retrieving Iterator object of the ArrayList class
	      Iterator<String> it = list.iterator();
	      //Creating an empty Set object
	      Set<String> set = new HashSet<String>();
	      //Adding elements of the ArrayList to the Set object
	      while(it.hasNext()) {
	         set.add(it.next());
	      }
	      //Removing all the elements from the ArrayList
	      list.clear();
	      //Adding elements of the set back to the list
	      list.addAll(set);
	      System.out.println("Contents of the Array List after removing duplicate elements: \n"+list);
	   }
}
