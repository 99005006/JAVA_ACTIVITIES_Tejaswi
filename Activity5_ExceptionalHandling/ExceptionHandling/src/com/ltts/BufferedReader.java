package com.ltts;


import java.util.InputMismatchException;
import java.util.Scanner;

public class BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the total runs scored");
		int runs=sc.nextInt();
		System.out.println("Enter the total overs faced");
		int overs=sc.nextInt();
		
		float c=  runs/overs;
		System.out.println("Current Run Rate : "+ c);
			
		}
		catch(InputMismatchException | NumberFormatException | ArithmeticException d ) {
			System.out.println(d.getClass());
		}
		sc.close();
	}

}
