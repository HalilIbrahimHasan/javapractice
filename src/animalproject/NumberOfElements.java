package animalproject;

public class NumberOfElements {
	
	/*
    count the words in a string one by one
    String is "Ali came to school and Ayse came to school."
    Ali = 1, came = 2, to = 2, school = 2, Ayse = 1, and = 1
     */
	
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();
		StringBuilder stb2 = stb;

		stb.append("Murat"); // taruM
		
		String name = "Ali";
		name = "Emrah";
		
		System.out.println(stb.toString().equals(stb.reverse().toString()));// 
		
	}

}
