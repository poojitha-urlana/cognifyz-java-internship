package Level1;
import java.util.*;

public class Task2_PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String word ");
		String inpstr = sc.nextLine();
		String str = inpstr.replaceAll("[\\s\\p{Punct}]", "");
	String rev = check(str);
	if(str.equals(rev)) {
		System.out.println(rev+ " is a palindrome ");
	}else {
		System.out.println(rev+" is not a Palindrome");
	}
	

	}
	public static String check(String s) {
		if(s.isEmpty()) {
		return s;	
		}
		return check(s.substring(1))+ s.charAt(0);
	}

}
