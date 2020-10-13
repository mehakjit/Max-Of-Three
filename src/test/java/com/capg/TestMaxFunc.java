package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxFunc {
	@Test
	public void ifFirst_Int_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree(5, 4, 3)));
	}
	@Test
	public void ifSecond_Int_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree(4, 5, 3)));
	}
	@Test
	public void ifThird_Int_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree(3, 4, 5)));
	}
	@Test
	public void ifFirst_Float_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Float)5.0f).equals(maximum.maxOfThree(5.0f, 4.0f, 3.0f)));
	}
	@Test
	public void ifSecond_Float_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Float)5f).equals(maximum.maxOfThree(4f, 5f, 3f)));
	}
	@Test
	public void ifThird_Float_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Float)5f).equals(maximum.maxOfThree(3f, 4f, 5f)));
	}
	@Test
	public void ifFirst_String_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(("abc").equals(maximum.maxOfThree("abc", "ab", "a")));
	}
	@Test
	public void ifSecond_String_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(("abc").equals(maximum.maxOfThree("ab", "abc", "a")));
	}
	@Test
	public void ifThird_String_Element_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(("abc").equals(maximum.maxOfThree("a", "ab", "abc")));
	}
}
