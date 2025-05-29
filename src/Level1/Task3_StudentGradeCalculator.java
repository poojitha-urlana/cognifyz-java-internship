package Level1;
import java.util.*;

public class Task3_StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of grades");
		int n = sc.nextInt();
		
		int grade[] = new int[n];
		int sum =0;
		System.out.println("Enter the grades: ");
		for(int i=0;i<n;i++) {
			 grade[i]= sc.nextInt();
		}
		for(int g: grade) {
			sum = sum+g;
		}
		double avg = (double)sum/n;
		System.out.println("Your average  grade is "+ avg);

	}

}
