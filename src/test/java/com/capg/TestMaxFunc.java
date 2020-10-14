package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxFunc {
	@Test
	public void testInteger() {
		TestMaxOfThree<Integer> test = new TestMaxOfThree<Integer>(1,2,5,3,4);
		Assert.assertTrue(((Integer)5).equals(test.max()));
	}
	@Test
	public void testFloat() {
		TestMaxOfThree<Float> test = new TestMaxOfThree<Float>(1f,2f,5f,3f,4f,0f);
		Assert.assertTrue(((Float)5f).equals(test.max()));
	}
	@Test
	public void testString() {
		TestMaxOfThree<String> test = new TestMaxOfThree<String>("a","ab","abcde","abcd");
		Assert.assertTrue(("abcde").equals(test.max()));
	}
}
