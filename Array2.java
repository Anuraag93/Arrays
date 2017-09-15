package com.array;

public class Array2 {

	public static void main(String[] args) {
		String []ar=new String[3];
		ar[0]="java";
		ar[1]="sql";
		ar[2]="j2ee";
		System.out.println("size="+ar.length);
		System.out.println("the elements present in ar array");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]="+ar[i]);
			
		}
		
		System.out.println("size="+args.length);
		System.out.println("the elements present in args array");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
		
		
	}

}
