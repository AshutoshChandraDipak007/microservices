package com.org.arrays.questions;

public class FindMaxMinElementsInArray {

	public static void main(String[] args) {
		int arr[] = { 12, 54, 10, 34, 21, 56, 27 };
		int max = arr[0], min = arr[0];		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}else if (arr[i] < min) {
				min = arr[i];
			}
		}       
		System.out.println(" max "+max+" min "+min);
	}
}
