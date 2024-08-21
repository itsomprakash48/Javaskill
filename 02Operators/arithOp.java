public class arithOp {
	public static void main(String[] args) {
		
		// binary ( jisme sirf 2 operands hote hai)
		System.out.println("♡ Binary operator  ");
		int a = 10;
		int b = 5;
		
		// addition
		System.out.println(a+b);
		
		//substraction
		System.out.println(a-b);
		
		//multiplication
		System.out.println(a*b);
		
		// division
		System.out.println(a/b);
		
		// % operatpr - gives the reminder
		System.out.println(a%b);
		
		System .out .println("UNARY OPERATOR ");
		
		//UNARY 
		                                                
        System.out.println("♡ Increament operator  ");
         // ●pre increament.    | ● post inc.. 
         //   (++a)                       | (a++)
        //     1. value change    |  1. value use
       //     2. value use.           |  2. value change
        System.out.println("Pre Increament operator  ");
        int a1= 10;
        int a2= ++a1;
        System.out.println(a1);
        System.out.println(a2); // pre  
             
       System.out.println("Post Increament operator  "); 
        int b1 = 12;
        int b2 = b1++;
        System.out.println(b1);
        System.out.println(b2); // post
         
        System.out.println("♡ Decreasement operator  ");      
// ■[ Decreasement operator] 
         // ●pre decrease.   .    | ● post decre..
        //     1. value change    |  1. value use
       //     2. value use.           |  2. value change
                        
 	    System.out.println("Pre Decreasement operator  ");           
        int c1= 10;
        int c2= --c1;
        System.out.println(c1); // pre           
        System.out.println(c2);
       
       
       System.out.println("Post Decreasement operator  ");
        int d1= 15; 
        int d2 = d1--;
        System.out.println(d1);
        System.out.println(d2); // post        
              
		
		
	}
}
