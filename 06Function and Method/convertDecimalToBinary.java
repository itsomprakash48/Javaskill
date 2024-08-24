import java.util.*;
public class convertDecimalToBinary {

    public static void decNum (int n){
        int pow =0;
        int bin = 0;

        while (n>0) {
            int rem = n%2;
            bin = bin + (rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2; 
        }

        System.out.println("The decimal form of is :" + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int num = sc.nextInt();
        decNum(num);

        sc.close();
    }
}
