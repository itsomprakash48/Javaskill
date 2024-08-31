package Array;

public class revAnArray {

    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length-1;

        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] =  temp; 
            first++;
            last--; 
            
        }

    }

    public static void main(String[] args) {
        // Reverse of an array 
        
        // [ 2,4,6,8,10] - [10,8,6,4,2]
        // 1st index  start ka aur last index ko exchange 
        // using swap function

        // int a = 2;
        // int b = 10;        
        // int temp = a;
        // int a = b;
        // int b = temp;
        int number[] = {2,4,6,8,10};
        reverse(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
        }
        System.out.println();
    }
}