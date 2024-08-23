public class callByValue {
    public static void main(String[] args) {
        // java always call by value

        // swap value exchange 
        int a = 10;
        System.out.println("a =" + a);
        int b = 20;
        System.out.println( "b =" +b);


        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("new a =" + a);
        System.out.println("new b =" + b);
    }    
}
