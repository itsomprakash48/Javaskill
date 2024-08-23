public class binomialCoefficient {

    /* 
     * Binomial coefficient
     * n
     *  C        =  n!/ r!(n-r)!
     *   r
     */
   /* 
   Long method by me 😅
   public static int binCoe(int n , int r ){

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


     /* 
     * Binomial coefficient
     * n
     *  C        =  n!/ r!(n-r)!
     *   r
     */

    public static int factorial(int n){

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
            
        }
        return f;  //factorial of n
    }

    public static int binCoe(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoe = fact_n / (fact_r*fact_nmr);
        return binCoe;
    }
    
        

    public static void main(String[] args) {
        System.out.println(binCoe(5, 2));

        
    }
}
