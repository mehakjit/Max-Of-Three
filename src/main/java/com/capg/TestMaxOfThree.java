package com.capg;

import java.util.Scanner;

public class TestMaxOfThree {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome : Compute max of three program");
		System.out.println("Enter the three no to find out which is maximum");
		Integer a = sc.nextInt() , b= sc.nextInt(), c = sc.nextInt();
		TestMaxOfThree maximum = new TestMaxOfThree();
		System.out.println(maximum.maxOfThree(a, b , c));
		System.out.println("Enter the three float no to find out which is maximum");
		Float l = sc.nextFloat(), m = sc.nextFloat(), n = sc.nextFloat();
		System.out.println(maximum.maxOfThree(l, m , n));
		System.out.println("Enter the three String values to find out which is maximum");
		String i = sc.next(), j = sc.next(), k = sc.next();		
		System.out.println(maximum.maxOfThree(i, j , k));
	}

	public <E extends Comparable<E>> E maxOfThree(E a, E b, E c) {
		E max = (a.compareTo(b) > 0) ?  a : b ;
		max = (max.compareTo(c) > 0) ? max : c ;
		return max;
	}
	
}
