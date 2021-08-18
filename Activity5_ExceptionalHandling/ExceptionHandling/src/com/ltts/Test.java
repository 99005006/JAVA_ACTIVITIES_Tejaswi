package com.ltts;

import java.util.Scanner;
class CustomException extends Exception{
	CustomException(String str){
		super(str);
	}
}
public class Test {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name");
		String name= sc.next();
		System.out.println("Enter the player age");
		int age=sc.nextInt();
		try {
		if(age>=19) {
		System.out.println("Player name: "+name+"\nPlayer age: "+age);
		}
		else {
			throw new CustomException("InvalidAgeRangeException");
		}
		}
		catch(CustomException in) {
			System.out.println(in);
		}

	}

}
