package com.ineuron;

import java.util.Scanner;

public class IneuronPattern {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); 
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==n/2) 
				{
					System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
				
			}
			System.out.print("\t");
			for(int j=0;j<n;j++) { 
				 if(j==0||j==n-1||i==j) 
				 {
				  System.out.print("*"); 
				  } 
				 else
				 { 
					 System.out.print(" "); 
					 } 
				 }
			System.out.print("\t");
			for(int j=0;j<n;j++) {
				  if(i==0||i==n-1||i==n/2||j==0) 
				  { 
					  System.out.print("*"); 
					  } 
				  else 
				  {
				  System.out.print(" ");
				  } 
				  }
			System.out.print("\t");
			for(int j=0;j<n;j++) {
				  if(j==0||j==n-1||i==n-1) 
				  { 
					  System.out.print("*"); 
					  } 
				  else 
				  {
				  System.out.print(" ");
				  } 
				  }
			System.out.print("\t");
			for(int j=0;j<n;j++) { 
				 if(i==0||j==0||(j==n-1&&i<=n/2)||i==n/2||(i>n/2&&i-j==n/2&&i!=n-1)||(j==i&&i==n-1)) 
				 {
				  System.out.print("*"); 
				  } 
				 else
				 { 
					 System.out.print(" "); 
					 } 
				 }
			System.out.print("\t");
			for(int j=0;j<n;j++) {
				  if(i==0||i==n-1||j==n-1||j==0) 
				  { 
					  System.out.print("*"); 
					  } 
				  else 
				  {
				  System.out.print(" ");
				  } 
				  }
			System.out.print("\t");
			for(int j=0;j<n;j++) { 
				 if(j==0||j==n-1||i==j) 
				 {
				  System.out.print("*"); 
				  } 
				 else
				 { 
					 System.out.print(" "); 
					 } 
				 }
				 
			System.out.println();
		
			
			
		}
	}
}

		
