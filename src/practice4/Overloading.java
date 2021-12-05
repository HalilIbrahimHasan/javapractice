package practice4;

public class Overloading {

	public static void addition(int n1, int n2, String description) {

	}

	public static void addition(int n1, String description, int n2) {

	}

	public static void addition(int n1, int n2) {

	}

	public static void addition(int n1, double n2) {

	}

	public static void main(String[] args) {
		main(args, "");
	}

	public static void main(String[] args, String name) {
		System.out.println("name");
	}

	// signature order
}
