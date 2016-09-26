package task1;

public class Password { 
	
	/*Ser at det er flere versjoner av 
	oppgave 6.18 basert på hvilken versjon av boka man har, 
	jeg har valgt å bruke disse kriteriene:
	- Minst 10 tegn
	- minst 3 tall*/	
	
	public static boolean checkPassword(String password) {
		if(checkLength(password)) {
			int countDigits = 0;
			for(int i = 0; i < password.length(); i++) {
				if(!Character.isLetterOrDigit(password.charAt(i)))
					return false;
				if(Character.isDigit(password.charAt(i)))
					countDigits++;
			}
			if(countDigits >= 3) 
				return true; 
		} 
		return false;  
	}
	
	public static boolean checkLength(String password) {
		if(password.length() < 10) 
			return false;
		return true; 
	} 

}
