package dummy4;

public class Password {
	
	public static void main(String[] args) {
		String password = "Sb>..af5jka";
		String specChars = "!#$%^&*()?+.";
		
		int sc = 0;
		int dg = 0;
		int lc = 0;
		int uc = 0;
		
		
		if(password.length() >= 7) {
			
			
			for (int i = 0; i < password.length(); i++) {
				
				if(specChars.contains(String.valueOf(password.charAt(i)))) {
					sc++;
				}
				
				if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z' ) {
					lc++;
				}
				
				if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' ) {
					uc++;
				}
				
				if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
					dg++;
				}
			}
			
			
			if(sc > 0 ) {
				if(dg > 0) {
					if(lc > 0) {
						if(uc > 0 ) {
							System.out.println("You have a successfull password creation");
						}else {
							System.out.println("You need to have at least 1 Upper Case");
						}
					}else {
						System.out.println("You need at least a Lower case char");
					}
				}else {
					System.out.println("you need at least a digit!");
				}
			}else {
				System.out.println("You need to add a spec char");
			}
			
			
			
			
			
			
		}else {
			System.out.println("Please type a longer password length!");
		}
	}

}
