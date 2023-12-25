package com.org.arrays.questions;

public class MoveAllNegativeNumbersToBeginningAndPositiveToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 }; 
        int n = arr.length; 
        
		 int j = 0, temp; 
	        for (int i = 0; i < n; i++) { 
	            if (arr[i] < 0 && i != j) { 
	            	temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
	                j++; 
	            } 
	        } 
	        for(int i=0; i<arr.length;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	}

}
