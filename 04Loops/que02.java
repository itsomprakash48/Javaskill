import java.util.*;
public class que02 {
	public static void main(String[] args) {
		// print number from 1  to n 
		
		Scanner sc = new Scanner(System.in);				
		int num = 1;
		int num2= sc.nextInt();
		
		while (num <= num2){
			System.out.println(num);
			num++;
		}
		sc.close();
	}
}