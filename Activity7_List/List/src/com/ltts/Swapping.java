package com.ltts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"Sun Risers Hyderabad","Delhi Capitals","Royal Challengers Bangalore","Kolkata Knight Riders", "Mumbai Indians"};
		Scanner sc=new Scanner(System.in);
		LinkedList teams = new LinkedList();
		for(String ele:s) {
			teams.add(ele);
		}
		System.out.println("Enter swap positions");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Collections.swap(teams, a, b);
		for(int i=0;i<teams.size();i++) {
			System.out.println(teams.get(i));
		}
	}

}
