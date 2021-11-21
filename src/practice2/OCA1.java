package practice2;

public class OCA1 {
	
	public static void main(String[] args) {
		
		int num = 10;
		do {
		System.out.print(num-- + " ");
		
		} while (--num == 0);
		
		System.out.println(num);
		
		/*
		What is the result?
		A) 543210
		B) 9
		C) 421
		D) 10
		E) Nothing is printed
	*/
	}

}
