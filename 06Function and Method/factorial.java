public class factorial {

    public static int factorialOfNum(int n) {
         int f=1;

         for (int i = 1; i<=n; i++) {
            f = f*i;
            
         }
        return f;
    }
    public static void main(String[] args) {
        int num =1;
        int fact = factorialOfNum(num);
        System.out.println(fact);
        
    }
}
