package Sorting;


public class selectionShort{
    public static void selectionSort(int arr[]){
        for (int i=0; i<arr.length; i++ ){
            int min = i;
            for (int j =i+1; j<arr.length ;j++ ){
                if (arr[min] > arr[j]) {
                    min = j;
                } 
            } 
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        } 
    }
    
    
    public static void printArr(int arr[]){
        for (int i=0; i < arr.length ;i++ ){
            System.out.print(arr[i]+ " ");
        } 
    }
	public static void main(String[] args) {
        System.out.println("SELECTION SHORT");
		int arr[] = {5,4,1,2,3};
		selectionSort(arr);
		printArr(arr);
		
        System.out.println();
		
	}
}
