package com.logic.ques;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		System.out.println("Enter two digit number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp = num;
		 int a = num%10;
		 int b = (num/10)%10;
		 int sol = (a+b)+(a*b);
		 
		 if(sol == temp) {
			 System.out.println("it is special two digit number");
		 }
		 else {
			 System.out.println("it is not a special two dit number");
		 }
		
	
}


}