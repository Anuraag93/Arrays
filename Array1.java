package com.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
//		declaration
		int []ar;
		//creating array object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size = sc.nextInt();
		ar=new int [size];
		System.out.println("the array before initialization");
		System.out.println("ar.length = "+ar.length);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		//initialization
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter "+(i+1)+"st Value");
			int num = sc.nextInt();
			ar[i]=num;
		}
		
		System.out.println("the array after initialization");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}//end of main

}//end of class
