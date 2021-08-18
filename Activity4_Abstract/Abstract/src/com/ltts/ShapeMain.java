package com.ltts;

import java.util.Scanner;

abstract class Shape{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public abstract double calculateArea(int value);
	
}

class Circle extends Shape{
	double pi=3.14;
	public double calculateArea(int value) {
		return pi*value*value;
	
	}
}
class Square extends Shape{
	public double calculateArea(int value) {
		return value*value;
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Sample Input");
		System.out.println("Circle\nSquare\nEnter the shape");
		String sh=sc.next();
		if(("Circle").equals(sh)) {
			Circle c= new Circle();
			System.out.println("enter radius");
			int r=sc.nextInt();
			c.setValue(r);
			System.out.println("Sample Output");
			double d=c.calculateArea(r);
			
			System.out.println("Area of Circle is: "+Math.round(d * 100.0) / 100.0);
		}
		else {
				System.out.println("enter side");
				int r=sc.nextInt();				
				System.out.println("Sample Output");
				Square s= new Square();
				s.setValue(r);
				double d=s.calculateArea(r);
				System.out.println("Area of Square is:  "+Math.round(d * 100.0) / 100.0);
			}
		sc.close();
	}}


