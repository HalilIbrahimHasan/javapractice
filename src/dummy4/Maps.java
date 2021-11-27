package dummy4;

import java.util.*;

public class Maps {
	
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Kazim");
		hs1.add("Zabit");
		hs1.add("Akrep");
		hs1.add("Cetin");
		hs1.add("Tarik");
		System.out.println(hs1);//[A, C, T, Z, K]
		TreeSet<String> ts3 = new TreeSet<>(hs1);
		System.out.println(ts3);
	}

}
