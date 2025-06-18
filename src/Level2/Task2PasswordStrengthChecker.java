package Level2;
import java.util.*;

public class Task2PasswordStrengthChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password");
		String pwd = sc.nextLine();
		
		System.out.println(check(pwd));
	}
	public static String check(String s) {
		int n = s.length();
		boolean hasUpper= false;
		boolean hasLower = false;
		boolean hasDigit = false;
		boolean hasSpecial = false;
		
		
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) 	 hasUpper= true;
			if(Character.isLowerCase(ch))  hasLower= true;
			if(Character.isDigit(ch)) 	 hasDigit= true;
			if(!Character.isLetterOrDigit(ch)) 	hasSpecial = true;
			
		}
		if(hasUpper &&hasLower &&hasDigit &&hasSpecial ) {
			return "Strong";
		}
		else if((hasUpper || hasLower) && hasDigit) {
			return "Medium";
		}else {
			return  "Weak";
		}
	}

}
