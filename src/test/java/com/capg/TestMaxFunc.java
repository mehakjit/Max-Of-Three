package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxFunc {
	@Test
	public void if_FirstElement_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree(5, 4, 3)));
	}
	@Test
	public void if_SecondElement_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree(4, 5, 3)));
	}
	@Test
	public void if_ThirdElement_Max_ReturnTrue() {
		TestMaxOfThree maximum = new TestMaxOfThree();
		Assert.assertTrue(((Integer)5).equals(maximum.maxOfThree(3, 4, 5)));
	}
}
