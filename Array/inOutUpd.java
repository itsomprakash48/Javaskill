package Array;
import java.util.*;

public class inOutUpd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size  = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
            
        }



        sc.close();
    }
    
}
