package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxFunc {
	@Test
	public void ifFirst_Int_Element_Max_ReturnTrue() {
		TestMaxOfThree<Integer> maximum = new TestMaxOfThree<Integer>(5,4,3);
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree()));
	}
	@Test
	public void ifSecond_Int_Element_Max_ReturnTrue() {
		TestMaxOfThree<Integer> maximum = new TestMaxOfThree<Integer>(4,5,3);
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree()));
	}
	@Test
	public void ifThird_Int_Element_Max_ReturnTrue() {
		TestMaxOfThree<Integer> maximum = new TestMaxOfThree<Integer>(3,4,5);
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree()));
	}
	@Test
	public void ifFirst_Float_Element_Max_ReturnTrue() {
		TestMaxOfThree<Float> maximum = new TestMaxOfThree<Float>(5f,4f,3f);
		Assert.assertTrue(((Float)5.0f).equals(maximum.maxOfThree()));
	}
	@Test
	public void ifSecond_Float_Element_Max_ReturnTrue() {
		TestMaxOfThree<Float> maximum = new TestMaxOfThree<Float>(4f,5f,3f);
		Assert.assertTrue(((Float)5f).equals(maximum.maxOfThree()));
	}
	@Test
	public void ifThird_Float_Element_Max_ReturnTrue() {
		TestMaxOfThree<Float> maximum = new TestMaxOfThree<Float>(4f,3f,5f);
		Assert.assertTrue(((Float)5f).equals(maximum.maxOfThree()));
	}
	@Test
	public void ifFirst_String_Element_Max_ReturnTrue() {
		TestMaxOfThree<String> maximum = new TestMaxOfThree<String>("abc","ab","a");
		Assert.assertTrue(("abc").equals(maximum.maxOfThree()));
	}
	@Test
	public void ifSecond_String_Element_Max_ReturnTrue() {
		TestMaxOfThree<String> maximum = new TestMaxOfThree<String>("ab","abc","a");
		Assert.assertTrue(("abc").equals(maximum.maxOfThree()));
	}
	@Test
	public void ifThird_String_Element_Max_ReturnTrue() {
		TestMaxOfThree<String> maximum = new TestMaxOfThree<String>("ab","a","abc");
		Assert.assertTrue(("abc").equals(maximum.maxOfThree()));
	}
}
