import java.util.Scanner ;
public class Que01 {
	public static void main(String[] args) {
		/*
In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" find the average of the 3 numbers");
		
		System.out.print(" Enter the 1st no :");
		int a = sc.nextInt();
		
		System.out.print(" Enter the 2nd no :");
		int b = sc.nextInt();
		
		System.out.print(" Enter the 3rd no :");
		int c = sc.nextInt();
		
		int sum = a+b+c ;
		
		int ans = sum/3;
		
		System.out.println("the average of " + a +" , "+b+" & " + c + " = " + ans);
		
		
		
		sc.close();
		
		
	}
}