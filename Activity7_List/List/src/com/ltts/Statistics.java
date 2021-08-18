package com.ltts;

import java.util.LinkedList;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList record = new LinkedList();
		System.out.println("Enter the player details\nEnter player name ");
		record.add(sc.nextLine());
		System.out.println("Enter age ");
		record.add(sc.nextInt());
		System.out.println("Enter Country");
		record.add(sc.next());
		System.out.println("Player Details");
		for(int i=0;i<record.size();i++) {
			System.out.println(record.get(i));
		}
		System.out.println("Enter Skill");
		sc.nextLine();
		String pos=sc.nextLine();
	
		System.out.println("Enter the position to add the skill");
		int p=sc.nextInt();
		record.set(p,pos);
		System.out.println("Player Details");
		for(int i=0;i<record.size();i++) {
			System.out.println(record.get(i));
		}
		System.out.println("Enter the position of the detail to be removed");
		int d= sc.nextInt();
		record.remove(d);
		System.out.println("Player Details");
		for(int i=0;i<record.size();i++) {
			System.out.println(record.get(i));
		}
		
		
		
		

	}

}
