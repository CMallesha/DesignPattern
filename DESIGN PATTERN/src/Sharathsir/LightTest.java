package Sharathsir;

import java.util.Scanner;

// CONSUMERCODE OR UTILIZATION CODE

public class LightTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the tube light you want");
		String input=sc.next();
		
		Switch sw=LightFactory.getLight(input);
		if(sw!=null) {
			sw.Son();
			sw.Soff();
		}
	}

}
