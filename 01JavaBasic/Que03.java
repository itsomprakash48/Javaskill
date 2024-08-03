import java.util.Scanner;
public class Que03 {
	public static void main(String[] args) {
/*
Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

*/
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Java mini bill output");
	
	System.out.println("Name of items : ");
	
	System.out.print("Item 01: ");
	String it1= sc.nextLine();
	
	System.out.print("Item 01: ");
	String it2= sc.nextLine();
	
	System.out.print("Item 01: ");
	String it3= sc.nextLine();
	
	System.out.print("price of "+it1 + " : ");
	int ip1 = sc.nextInt();
	
	System.out.print("price of "+it2+ " : ");
	int ip2 = sc.nextInt();
	
	System.out.print("price of "+it3+ " : ");
	int ip3 = sc.nextInt();
	
	// total amount 
	int sum = ip1+ip2+ip3;
	
	// 18% gst amount of total 
	int exist = (sum*18) / 100 ;

	

	System.out.println("Amount of items is : "+sum);
	System.out.println("Total tax on items "+exist);
	
	System.out.println("Total amount to be paid :" + (sum+exist) );
	
				
	}
}