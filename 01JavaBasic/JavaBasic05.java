import java.util.* ;

public class JavaBasic05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// using sc.next - sirf single word print hoga
		//String a = sc.next() ;
		//System.out.println(a);
// sc.nextLine se pura sentance print hoga 
		String A1 = sc.nextLine();
		System.out.println(A1);
		
		/*
		next
		nextLine
		nextInt
		nextByte
		nextFloat
		nextDouble
		nextBoolean
		nextShort
		nextLong
		*/
		sc.close();
	}
}