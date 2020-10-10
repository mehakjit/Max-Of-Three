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
	}

	public Integer maxOfThree(Integer a, Integer b, Integer c) {
		Integer max = (a.compareTo(b) > 0) ?  a : b ;
		max = (max.compareTo(c) > 0) ? max : c ;
		return max;
	}
}
