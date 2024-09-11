package Array;

public class maxSubArray {

    public static void printSubArray(int number[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i=0; i<number.length; i++ ) {
			int start = i;

			for (int j=i; j<number.length; j++ ) {
				int end = j;
				currSum = 0;
				for (int k=start; k<=end ; k++ ) {
					//System.out.print(number[k]+ " " );
					currSum += number[k];
                    
				}
				System.out.println(currSum + " ..["+number[i] + ","+ number[j] +"]");
				if (maxSum < currSum) {
					maxSum=currSum ;
				}
			}

		}

		System.out.println(" max sum = " + maxSum);

	}

	public static void main(String[] args) {
		System.out.println("Hello World");

		int number[] = {1, -2, 6, -1, 3};
// 		int number[] = {2, 4, 6, 8, 10};
		printSubArray(number);


	}
    
}
