import java.util.*;


class que08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        
        int num_ip = sc.nextInt();  // Number of inputs
        
        for (int i = 0; i < num_ip; i++) {  // Declare `i` as an int and add braces
            int userip = sc.nextInt();  // Get user input
            
            if (userip % 10 == 0) {
                System.out.println("multiple of ten");
                break;  // Exit the loop if the number is a multiple of ten
            }
            
            System.out.println(userip);  // Print the input
        }
        
        sc.close();  // Close the scanner to prevent resource leaks
    }
}
