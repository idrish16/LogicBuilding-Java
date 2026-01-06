package com.logic.ques;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num>0) {
			int d = num % 10;
			System.out.print(d+" ");
			num = num/10;
			
		}
		
		
	}

}
