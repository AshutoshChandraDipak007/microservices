package com.org.john.deer.pkg;

public class SegrigateZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0,1,2,3,7,2,8,0,3,6,0,0,2,0,0};		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[arr.length-j-1]==0&&j>0) {
					int index=arr.length-1;
					int temp=arr[index-j];
					arr[index-j]=arr[index-j-1];
					arr[index-j-1]=temp;
				}
			}
		}
       for(int k=0; k<arr.length;k++) {
    	   System.out.print(" "+arr[k]);
       }
	}

}
