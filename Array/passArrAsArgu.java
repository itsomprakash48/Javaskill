package Array;
import java.util.*;
// Passing Array as Arguments 


public class passArrAsArgu {

    public static void update(int mark[]){
        for(int i = 0 ; i < mark.length; i++){
            mark[i]= mark[i]+1;
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // passing an array as argument meaning - 
        // in the function we had seen that whatever arguments are there in psMain 
        // they are copied and passed to some other function and whatever value is there in that is used in that function only.

        // but 

        // by reference method if the index value/ value of Array is change in another function it effects
        //  also shows on main function

        int mark[] = {97,98,99};
        update(mark);

        for(int i = 0 ; i < mark.length; i++){
            System.out.print(mark[i]+" ");
            
        }

        sc.close();
    }
    
}
