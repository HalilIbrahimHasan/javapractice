package practice3;

public class Example {
	
	
public static void main(String[] args) {
		
		String s = "Java is easy";
		System.out.println(s);
		
		s = s.replaceAll("\\s", "");		
		System.out.println(s);
		
		char c = 'w';
		int counter = 0;
		int idxOfFirstOccurence = s.indexOf(c);
		int idxOfLastOccurence = s.lastIndexOf(c);
		
		if(idxOfFirstOccurence==idxOfLastOccurence) {
			
			System.out.println(-1);
			
		}else {
			
			for(int i=idxOfFirstOccurence+1; i<idxOfLastOccurence; i++) {
				counter++;
			}			
			System.out.println("The number of characters different from space: " + counter);
		}
	}

}
