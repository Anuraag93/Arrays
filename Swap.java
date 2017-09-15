package com.array;

public class Swap {
	public static void main(String[] args) {
		int a= 10;
		int b=5;
		
		System.out.println("values before Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("values after Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
}
