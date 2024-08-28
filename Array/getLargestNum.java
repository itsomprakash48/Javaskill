package Array;

public class getLargestNum {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest<number[i]) {
                largest = number[i];
                System.out.println(largest + " is grater than");
            }

        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};
        System.out.println(getLargest(number));

    }
    
}
