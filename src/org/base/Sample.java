package org.base;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		System.out.println("This is MASTER");
		
		System.out.println("This is B");
		System.out.println("This is B");
		String original,reverse="";
		Scanner rn=new Scanner(System.in);
		System.out.println("Enter a string reverse");
		original=rn.nextLine();
		int length=original.length();
		
		for (int i = length-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
			}
		
		System.out.println("Reverse of entered string is:"+reverse);

	}

}
