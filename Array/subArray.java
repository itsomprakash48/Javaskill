package Array;
public class subArray {
    
    
    public static void printSubArray(int number[]){
        for (int i=0; i<number.length; i++ ){
            int start = i;
            
            for (int j=i; j<number.length; j++ ) {
                int end = j;
                
                for (int k=start; k<=end ; k++ ) {
                    System.out.print(number[k]+ " " );
                
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }

	public static void main(String[] args) {
		System.out.println("Hello World");
		
        //  Print sub array -  [2,4,6,8,10]
        //  - sub array - a continuous part of array
        //  - [2] - [2,4] - [2,4,6] - [2,4,6,8] - [2,4,6,8,10]
        //  - [4] - [4,6] - [4,6,8] - [4,6,8,10]
        //  - [6] - [6,8] - [6,8,10]
        //  - [8] - [8,10]
        //  - [10]
        
        // * 3 nested loop requre
        // 1 loop - finding start
        // 2 loop - finding end
        // 1 loop - printing number between start and end
        
        int number[] = {2, 4, 6, 8, 10};
        printSubArray(number);
        
        
	}
}
