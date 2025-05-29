package Level1;
import java.util.*;

public class Task4_RandomPasswordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		StringBuilder sb = new StringBuilder();
		String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower= "qwertyuioplkjhgfdsazxcvbnm";
		String numeric ="1234567890";
		String spl = "!@#$%^&*?/|.,<>:" ;
		String all = Upper+lower+numeric+spl;
		System.out.println("Enter length of the Password (Length must be at least 4): ");
		int n = sc.nextInt();
		if (n < 4) {
            System.out.println("Length must be at least 4.");
        }
		sb.append(Upper.charAt(rd.nextInt(Upper.length())));
        sb.append(lower.charAt(rd.nextInt(lower.length())));
        sb.append(numeric.charAt(rd.nextInt(numeric.length())));
        sb.append(spl.charAt(rd.nextInt(spl.length())));
		for(int i=4;i<n;i++) {
			int index = rd.nextInt(all.length());
			sb.append(all.charAt(index));
			
		}
		System.out.println("Password : "+ sb.toString());
		

	}

}
