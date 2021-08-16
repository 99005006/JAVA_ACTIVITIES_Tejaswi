package com.ltts;

import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter color name");
		String color= sc.next();
		switch (color){
		case "Pink" :
			System.out.println("Color is Pink");
			break;
		case "Yellow" :
			System.out.println("Color is yellow");
			break;
		case "Red" :
			System.out.println("Color is Red");
			break;
		}
		sc.close();
		
	}

}
