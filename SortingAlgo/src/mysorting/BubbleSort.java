package mysorting;

public class BubbleSort {
		public static void BubbleSort(final int[] arr) {
			int n = arr.length;
			int temp = 0;
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<(n-i-1); j++) {
					if(arr[j]>arr[j+1]) {
						temp = arr[j];   //Swap
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
				 
			}
		}
		public static void main(String[] args) {
			int[] arr = {3,5,1,7,8,4};
			System.out.println("Before Swapping");//Before swapping
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			BubbleSort(arr);
			System.out.println("After Swapping"); //After swapping
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
}
