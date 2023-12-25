package com.org.arrays.questions;

public class ReverseTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,4,6,3,8,9,0,2,11,78,12};
		int  revArray [] = new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			revArray[i]=arr[arr.length-i-1];
			System.out.println(" arrays elements "+arr[i]);
		}
		
		//System.out.println("###########################################");
		System.out.println();
		System.out.println("###########################################");
		//System.out.println(" revers element without interchange ");
		System.out.println("###########################################");
		System.out.println();
		for(int i=0; i<revArray.length;i++) {
			System.out.println(" revArray "+revArray[i]);
		}
		System.out.println();
		System.out.println("###########################################");
		System.out.println(" revers element without interchange ");
		System.out.println("###########################################");
		System.out.println();
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(" revers element without interchange "+arr[arr.length-1-i]);
		}
		
		System.out.println(" revers element without interchange ");
		
		for(int i=0; i<arr.length;i++) {			
			int temp,start=0,end=arr.length-1-i;
			if(end>start) {
				temp=start;
				start=end;
				end=temp;
			}
		}
		System.out.println();
		System.out.println("###########################################");
		System.out.println();
		
		for(int i=0; i<arr.length;i++) {			
			System.out.println(" reverse of arrays with temp "+arr[i]);
		}
	}
}
