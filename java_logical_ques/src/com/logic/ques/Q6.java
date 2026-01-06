package com.logic.ques;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0;
		while(num>0) {
			int d = num%10;
			rev = rev*10+d; 
			num = num/10;
			
		}
		System.out.println(rev);
		
		

}

}
