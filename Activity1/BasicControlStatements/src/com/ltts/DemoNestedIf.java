package com.ltts;

import java.util.Scanner;

public class DemoNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a, b, c values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println(a +" is the largest number");
			}
			else {
				System.out.println(c+" is the largest number");
			}
		}
		else if(b>c) {
			System.out.println(b+ " is the largest number");
		}
		else {
			System.out.println(c + " is the largest number");
		}
sc.close();
	}

}
