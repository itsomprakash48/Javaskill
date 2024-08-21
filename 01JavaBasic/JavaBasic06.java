import  java.util.* ;
public class JavaBasic06 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st numbers: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);
		sc.close();
	}
}