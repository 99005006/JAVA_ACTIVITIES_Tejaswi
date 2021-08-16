package com.ltts;

import java.util.Scanner;

public class DemoArrayUserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[] =new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("enter a["+i + "] value");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"] value is\t"+ a[i]);
		}
		sc.close();

	}

}
