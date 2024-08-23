import java.util.*;
public class productOfab {
    public static int multiply(int a, int b){
        int product = a*b;

        return product;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no a =");
        int num1 = sc.nextInt();
        System.out.print("Enter no a =");
        int num2 = sc.nextInt();
        int ans = multiply(num1, num2);
        System.out.println(num1 + " x " + num2 +" = "+ans);


        sc.close();
        
    }
}
