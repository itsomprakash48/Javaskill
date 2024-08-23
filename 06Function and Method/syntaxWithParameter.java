public class syntaxWithParameter {
    public static int calculateSum(int num1, int num2){ // parameters or formal parameters
        int sum = num1+num2;
        //System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //calculateSum(a, b);
        int sum = calculateSum(a, b); //arguments or actual parameter
        System.out.println(sum);
        
    }
}
