package com.ltts;

import java.util.Scanner;

public class BufferedReader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the number of overs");
		int overs=sc.nextInt();
		System.out.println("Enter the number of runs for each over");
		int [] a= new int[overs];
		for(int i=0;i<overs;i++) {
		a[i] =sc.nextInt();
		}
		System.out.println("Enter thr over number");
		int n=sc.nextInt();
		System.out.println(a[n-1]);
		
		}
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e ) {
			System.out.println(e.getClass());
		}
		
		

	}

}
