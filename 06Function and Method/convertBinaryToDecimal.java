import java.util.*;
public class convertBinaryToDecimal {

    public static int decimal(int n){
        int pow =0;
        int dec = 0;

        while (n>0) {
            int lastDigi = n%2;
            dec = dec+lastDigi*(int)Math.pow(2,pow);
            pow++;
            n = n/10; 
        }
        return dec;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int num = sc.nextInt();
        int binnum = decimal(num);
        System.out.println("The decimal form of " + num +" is :"+binnum);

        sc.close();
    }
}
