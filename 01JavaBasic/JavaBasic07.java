import  java.util.Scanner;
public class JavaBasic07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The are of circle = 3.14× r^2");
		System.out.print("Enter the value of radius : "); 
		Float rad = sc.nextFloat();
		Float Q = 3.14f; 
		
		Float area = Q*rad*rad;
		
		System.out.println("The area of circle is = "+area);
		sc.close();
	}
}