package com.org.arrays.questions;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 7, 1,0,2,34,12,5 };
		int k = 6;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
                  if(arr[i]+arr[j]==k) {
                	  System.out.println(" pair "+arr[i]+"  "+arr[j]+" indexes "+i+" "+j);
                  }
			}
		}
	} 
}
