import  java.util.*;
public class que03 {
	public static void main(String[] args) {

		// print the sun of n natural number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number :");
		int n =sc.nextInt();
		int sum = 0;
		int i= 1;
		
	//	int num3 = num2*(num2+1)/2 ; (mathematical formula)
		
		while (i<= n){
			sum= sum+i;
			i++;
		}
		
		System.out.println("Your answer :" + sum);
		
	
		
		sc.close();
	}
}