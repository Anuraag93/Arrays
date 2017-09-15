package com.array;

import java.util.Scanner;

public class SorttingArray {
	public static int [] sort(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j])
				{
					ar[i]=ar[i]^ar[j];
					ar[j]=ar[i]^ar[j];
					ar[i]=ar[i]^ar[j];
					
				}
			}
		}
		return ar;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int []ar= new int[size];
	
		int n=0;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter the value at "+i+" position");
			ar[i]=sc.nextInt();
		}
		System.out.println("the array elements are ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+",");
		}
		System.out.println();
		
		
		int ar1[] = sort(ar);
		System.out.println("the array elements after sorting");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar[i]+",");
		}
		System.out.println();
		do
		{
			System.out.println("enter which maximum number");
			n = sc.nextInt();
			if(n==0)
				break;
			int index =  ar1.length-n;
			System.out.println("the "+n+"th largest number is ");
			System.out.println(ar[index]);
		}while(n!=0);
	}
}
