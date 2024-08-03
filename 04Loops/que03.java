import  java.util.*;
public class que03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int sum = 0;
		int i= 1;
		
	//	int num3 = num2*(num2+1)/2 ;
		
		while (i<= n){
			sum= sum+i;
			i++;
		}
		
		System.out.println(sum);
		
	
		
		
	}
}