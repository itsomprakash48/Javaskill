package Array;


public class pairInArray {
    public static void Pairs(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i]; // 2,4,,6,8,10
            for (int j = i+1 ; j < number.length; j++) {
                System.out.print("("+ current + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
            
        }
        System.out.println("Total no of pairs : "+tp);
    }

    public static void main(String[] args) {
     /*
     * Pairs in array 
     * [2,4,6,8,10]
     * 
     * // note : pairs do not repeat 
     * (2,4)(2,6)(2,8)(2,10)   - 2 
     * (4,6)(4,8)(4,10)        - 4
     * (6,8)(6,10)             - 6
     * (8,10)                  - 8
     * 
     * Hint 
     *  .Nested loop 
     * 
     * 
     * 
     */
    int number[] = {2,4,6,8,10};
    Pairs(number);
    
    
    
     
    }

}
