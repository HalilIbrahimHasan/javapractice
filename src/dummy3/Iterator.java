package dummy3;

import java.util.*;

public class Iterator {
	
	public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();
     
      
         
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
    }

}
