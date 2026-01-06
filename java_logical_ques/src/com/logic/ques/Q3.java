package com.logic.ques;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		int sumodd=0;
		while(num>0) {
			int d = num % 10;
			if(d%2==0) {
				sum = sum + d;
			}
			else if(d%2!=0) {
				sumodd = sumodd+d;
			}
			
			num = num/10;
			
		}
		System.out.println("sum even no. = "+sum);
		System.out.println("sum odd no. = "+sumodd);
		
		
	}

}
