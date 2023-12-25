package com.org.arrays.questions;

import java.util.Arrays;

public class FindTheKthMaxMinElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 54, 10, 34, 21, 56, 27 };
		 int arrMaxMin[]=getMinMax(arr,3);	
		System.out.println(" min "+arrMaxMin[0]+" max "+arrMaxMin[1]);
	}

	private static int[] getMinMax(int arr[],int kth) {
		int getMinMax[]=new int[2];
		int min ,max;
		System.out.println(" After sort "+kth);		
		Arrays.sort(arr);	
		
		min=arr[kth-1];
		max=arr[arr.length-kth];
				
		getMinMax[0]=min;
		getMinMax[1]=max;	
		//System.out.println(" min "+getMinMax[0]+" max "+getMinMax[1]);
		return arr;		
	}
}
