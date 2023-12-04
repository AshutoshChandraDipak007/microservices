package com.org.john.deer.pkg;

public class InterviewQuestions {

//	Marks => { 23, 1, 87, 81, 12, 84, 25  }  == marks
//	Roll No => { 1,5,2,3,4,0,6 }             == rollNo
//	Output =>{1,84,87,81,12,23,25 }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]={ 23, 1, 87, 81, 12, 84, 25};
		int rollNo[]={ 1,5,2,3,4,0,6 };
			
		for(int i=0; i<rollNo.length;i++) {
			System.out.println(" roll no "+rollNo[i]+" marks "+marks[rollNo[i]]);
		}
		
	}

}
