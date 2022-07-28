package com.numberPackage;

import java.util.Scanner;

public class NumberPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); 
		/* int n=4; */
		int value=1;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(value+" ");
			}
			
			value++;
			System.out.println();
		}

	}

}
