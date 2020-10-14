package com.capg;

import java.util.ArrayList;
import java.util.Collections;


public class TestMaxOfThree<E extends Comparable<E>> {
	ArrayList<E> list = new ArrayList<>();
	
	public TestMaxOfThree(E... typ) {
		for(E value : typ)
			this.list.add(value);
	}

	public static <E extends Comparable<E>> E maxOfThree(ArrayList<E> list) {
		if (list.size() == 0)
			return null;
		else {
			System.out.println("Maximum : " + Collections.max(list));
			return Collections.max(list);
		}
	}
	 public E max() {
		 return maxOfThree(list);
	 }
	
	public static void main(String[] args) {
		System.out.println("Welcome : Compute max of three program");
	}

	
	
}
