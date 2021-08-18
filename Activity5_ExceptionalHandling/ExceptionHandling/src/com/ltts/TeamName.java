package com.ltts;

import java.util.Scanner;
class TeamNameNotFoundException extends Exception{
	TeamNameNotFoundException(String str){
		super(str);
	}
}

public class TeamName {
		static boolean Validate(String s) {
			int flag=0;
			String[] names = new String[] {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		for(String ele: names) {
			if(ele.equals(s)) {
				flag=1;
				break;
			}
		}
		if (flag==1) {
			return true;
		}
		return false;
		}
	public static void main(String[] args) throws TeamNameNotFoundException  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.println("Enter the expected winner team of IPL Season 13");
		String win=sc.nextLine();
		if(Validate(win)) {
		
			System.out.println("Enter the expected runner Team of IPL Season 13");
			String run=sc.nextLine();
			
			if (Validate(run)) {
				System.out.println("Expected IPL Season 13 winner: "+win);
				System.out.println("Expected IPL Season 13 runner: "+run);
				}
			else {
				
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
			}
		}
		else {
			throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
		}
		}
		catch(TeamNameNotFoundException t) {
			 System.out.println(t);
		}
		sc.close();
	}

}
