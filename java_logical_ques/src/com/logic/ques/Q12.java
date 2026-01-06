package com.logic.ques;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		System.out.println("Enter arr elements");
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				arr[i][j]= sc.nextInt();
				
			}
		}
		System.out.println("Printing......");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i==j) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	}

}
