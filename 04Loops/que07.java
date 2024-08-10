public class que07 {
    public static void main(String[] args) {
        int number = 10899;
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;  // Last digit nikalna
            reverse = reverse * 10 + digit;  // Reverse number mein add karna
            number = number / 10;  // Last digit ko remove karna
        }
        
        System.out.println("Reverse of the given number is: " + reverse);
    }
}
