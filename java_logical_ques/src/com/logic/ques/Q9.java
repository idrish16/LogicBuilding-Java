package com.logic.ques;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int isprime =0;
		int i =2;
		while(i<num/2) {
			if(num%i==0) {
				isprime++;
			}
			i++;	
		}
		if(isprime == 0) {
			System.out.println("no. is prime");
		}
		else {
			System.out.println("no. is Not prime");
		}
	
	
}
}
