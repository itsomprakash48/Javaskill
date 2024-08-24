public class functionOverloading {

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static void main(String args[]){

        // function overloading
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2.5, 3.5));
        
    }

    // explain function overloading using parameters
    // function overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
    
}
