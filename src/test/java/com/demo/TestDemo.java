package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {

	@Test
	public void verify() {
		int a = 15;
		int b = 15;

		Assert.assertEquals(a, b);
	}
	@Test
	public void verifyAgain() {
		int a = 15;
		int b = 5;

		Assert.assertTrue(a>b);
	}
}
