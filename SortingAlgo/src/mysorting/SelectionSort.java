package mysorting;

import java.util.Scanner;

public class SelectionSort {
	
	 public static void selectionSort(int[] arr) {
		 for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }
	 }
	 
 public static void main(String a[]){  
     int n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements in an array");
     n = sc.nextInt();
     int[] arr1 = new int[n];
     System.out.println("Please enter the elements");
     for(int i =0 ; i<n; i++) {
    	 arr1[i] = sc.nextInt();
     }
     System.out.println("Before Selection Sort");  
     for(int i:arr1){  
         System.out.print(i+" ");  
     }  
     System.out.println("\n");  
       
     selectionSort(arr1); 
     System.out.println("After Selection Sort");  
     for(int i:arr1){  
         System.out.print(i+" ");  
     }  
  }  
}
