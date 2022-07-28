package com.ineuron;

import java.util.Scanner;

public class WpatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); 
		for (int i=0;i<n;i++) {
			for (int j=0;j<((n-1)*2);j++) {
				if (i >= j||i+j>=((n-1)*2)-1 ||i==n-1)/*(n-1)*2)-1*/ {
					System.out.print("*");
					
				}
				else
					System.out.print(" ");//*************
			}
			System.out.println();
			
		}

	}

}
