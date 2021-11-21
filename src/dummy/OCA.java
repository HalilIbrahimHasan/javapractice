package dummy;

import java.util.Scanner;

public class OCA {

	public static void main(String[] args) {
		String str = "M ";
		str = str.concat("E ");
		String add = "S ";
		str = str.concat(add);
		str.replace("S", "T");
		str = str.concat(add);
		System.out.println(str);

		int num = 10;
		do {
			System.out.print(num-- + " ");
		} while (num == 0);
		/*
		 * What is the result? A) 543210 B) 9 C) 421 D) 10 E) Nothing is printed
		 */

		// 22 11
		double d = 8 + 2 * (14 - 6 / 2) - 12;

		System.out.println(d);

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 2 numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("Now Enter the operation you want to do!");
		String operation = scan.next().toLowerCase();
		
		
		if(operation.equals("addition")) {
			addition( n1,  n2);
		}else if(operation.equals("subtraction")) {
			subtraction(n1,n2);
		}

	}

	public static void addition(int n1, int n2) {

		System.out.println(n1 + n2 + " here is the sum of addition");

	}

	public static void subtraction(int n1, int n2) {

		System.out.println(n1 - n2 + " here is the sum of subtraction");

	}

	public static void multiplication(int n1, int n2) {

		System.out.println(n1 * n2 + " here is the sum of multiplication");

	}
	
	public static void division(int n1, int n2) {

		System.out.println(n1 * n2 + " here is the sum of division");

	}
}
