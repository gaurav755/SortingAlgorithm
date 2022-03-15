package mysorting;

public class InsertionSort {
	public static void InsertionSort(int[] array) {
		 int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	}

	public static void main(String[] args) {
		int[] arr = {3,5,1,7,8,4};
		System.out.println("Before Swapping");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		InsertionSort(arr);
		System.out.println("After Swapping");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
