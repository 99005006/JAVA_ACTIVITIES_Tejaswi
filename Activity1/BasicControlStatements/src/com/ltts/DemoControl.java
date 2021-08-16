package com.ltts;

public class DemoControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks =56;
		
		if (marks> 30 && marks<40) {
			System.out.println("Grade C");
		}
		else if(marks>=40 && marks<60) {
			System.out.println("Grade B");
		}
		else if(marks>=60 && marks<=75) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("Fail");
		}


	}

}
