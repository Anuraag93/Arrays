package com.array;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int sum = 0;
		
		int []ar = new int [size];
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value ");
			int num = sc.nextInt();
			ar[i]=num;
			sum=sum+ar[i];
			
		}
		System.out.println("the sum of the array is "+sum);
	}
}
