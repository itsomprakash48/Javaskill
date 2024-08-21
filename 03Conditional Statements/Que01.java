import java.util.*;
public class Que01 {
	public static void main(String[] args) {
		// print the largest of 2 numbers 
		Scanner sc = new Scanner( System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1> num2) {
			System.out.println(num1+" greater ");
		}
		
		else {
			System.out.println(num2+ "  barka ");
		}
		sc.close();
	}
}