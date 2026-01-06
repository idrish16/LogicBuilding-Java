package com.logic.ques;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		System.out.println("Enter two number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num3=0;
		for(int i =1; i<=num && i<=num1; i++) {
			
			if(num % i ==0 && num1 % i ==0) {
				
				num3=i;
			}
		}
		System.out.println("hcf = "+num3);

		
	
}
	

}
