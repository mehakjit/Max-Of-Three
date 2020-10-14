package com.capg;

import java.util.Scanner;

public class TestMaxOfThree<E extends Comparable<E>> {
	E typ1,typ2,typ3;
	
	public TestMaxOfThree(E typ1, E typ2, E typ3) {
		this.typ1 = typ1;
		this.typ2 = typ2;
		this.typ3 = typ3;
	}

	public static <E extends Comparable<E>> E maxOfThree(E a, E b, E c) {
		E max = (a.compareTo(b) > 0) ?  a : b ;
		max = (max.compareTo(c) > 0) ? max : c ;
		return max;
	}
	
	public <E extends Comparable<E>> E maxOfThree() {
		return (E) maxOfThree(typ1, typ2, typ3);
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome : Compute max of three program");
		System.out.println("Enter the three no to find out which is maximum");
		Integer a = sc.nextInt() , b= sc.nextInt(), c = sc.nextInt();
		System.out.println(maxOfThree(a, b , c));
		System.out.println("Enter the three float no to find out which is maximum");
		Float l = sc.nextFloat(), m = sc.nextFloat(), n = sc.nextFloat();
		System.out.println(maxOfThree(l, m , n));
		System.out.println("Enter the three String values to find out which is maximum");
		String i = sc.next(), j = sc.next(), k = sc.next();		
		System.out.println(maxOfThree(i, j , k));
	}

	
	
}
