package Array;
import java.util.*;

public class operationInArray { 
    //  Create -> input -> output -> update 

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        
        int size  = sc.nextInt();   //  input for the length of array

        
        int number[] = new int[size];  //Creating an array - the size of an array is given by user

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();   // element o index value of java 
            
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
            
        }



        sc.close();
    }
    
}
