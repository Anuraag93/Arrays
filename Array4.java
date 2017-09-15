package com.array;

import java.util.Scanner;

public class Array4 {

	public static int sumOfArray(int []a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			
		}
		return sum;
				
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int sum = 0;
		
		int []ar = new int [size];
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value ");
			int num = sc.nextInt();
			ar[i]= num;
			
		}
		
		System.out.println("the sum of the array is "+sumOfArray(ar));
	}
}
