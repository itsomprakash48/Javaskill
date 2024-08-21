import  java.util.*;

public class Que {
	public static void main(String[] args) {
		// print the number is odd or even
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if ( num % 2 == 0){
			System.out.println(" even");
			
		}
		else {
			System.out.println(" odd ");
		}
		
		
		sc.close();
	}
}