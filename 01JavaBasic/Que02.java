import java.util.Scanner ;
public class Que02 {
	public static void main(String[] args) {
		
		/*
 In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side))		
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To find the area of square ");
		System.out.print("Side [cm] :");
		 float a = sc.nextFloat();
		
		float area =  a*a;
		
		System.out.println("The are of the square is "+area);
		
		
		sc.close();
	}
}