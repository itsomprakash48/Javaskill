import java.util.*;
public class Proj01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("selective arithmetic operation accroding to their assigned number : ");
		System.out.println("Addition = 1");
		System.out.println("Substraction = 2");
		System.out.println("multiplication = 3");
		System.out.println("division = 4");
		
		System.out.print("Enter Operation no : ");
		int  number = sc.nextInt();
		
		if (number == 1){
			System.out.println("Addition");
			System.out.print("A :");
			int num1 = sc.nextInt();
			System.out.print("B :");
			int num2 = sc.nextInt();
			System.out.println(num1 + "+" + num2 + " = "  +(num1+num2));
		}
		
		if (number == 2){
			System.out.println("Substraction");
			System.out.print("A :");
			int num1 = sc.nextInt();
			System.out.print("B :");
			int num2 = sc.nextInt();
			System.out.println(num1 + "-" + num2 + " = "  +(num1-num2));
		}
		
		if (number == 3){
			System.out.println("Multiplication");
			System.out.print("A :");
			int num1 = sc.nextInt();
			System.out.print("B :");
			int num2 = sc.nextInt();
			System.out.println(num1 + "x" + num2 + " = "  +(num1*num2));
		}
		
		
		if (number == 4){
			System.out.println("Division");
			System.out.print("A :");
			int num1 = sc.nextInt();
			System.out.print("B :");
			int num2 = sc.nextInt();
			System.out.println(num1 + "÷" + num2 + " = "  +(num1/num2));
		}
		
		
		//else {
		//	System.out.println("bahut bubak ho beta tum ");
		//}
		
		sc.close();
	}

	
}	
