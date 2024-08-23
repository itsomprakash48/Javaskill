public class binomialCoefficient {

   /* 
   Long method by me 😅
   public static int binoCoe(int n , int r ){

        // n input - factorial
        int fn = 1;
        for (int i = 1; i <=n; i++) {
            fn = fn*i;  
        }  

         // R input - factorial
        int fr = 1;
        for (int i = 1; i <=r; i++) {
            fr = fr*i;  
        }

        int ff = 1; 
        for (int i = 1; i<=(n-r); i++) {
            ff = ff*i;  
        }

        int down_process = fr*ff;
        int answer = fn/down_process;

    return answer;
    }

    */

    public static int factorial(int n){

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
            
        }
        return f;  //factorial of n
    }

    public static int binoCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binoCoeff = fact_n / (fact_r*fact_nmr);
        return binoCoeff;
    }
    
        

    public static void main(String[] args) {
        System.out.println(binoCoeff(5, 2));
        
    }
}
