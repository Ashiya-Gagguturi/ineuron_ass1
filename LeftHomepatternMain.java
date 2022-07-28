package com.ineuron;

import java.util.Scanner;

public class LeftHomepatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); 
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=(n/2)-1||(i-j>=(n/2)-1&&i>=n/2)||i==0||i==n-1) {
					System.out.print("*");
					
				}
				else
					System.out.print(" ");
				}
			System.out.println();
			}
		}

	}


