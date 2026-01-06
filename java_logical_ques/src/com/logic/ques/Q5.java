package com.logic.ques;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
			
			
		}
		System.out.println("count = "+count);
		

}
}
