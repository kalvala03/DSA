package com.mathsforDSA;

import java.util.Scanner;

public class Swap {
	public static void main(String[]args) {
		//Write a program to swap Given two numbers.(Without using third variable)
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a & b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:"+a+" "+b);
		sc.close();
	}
}