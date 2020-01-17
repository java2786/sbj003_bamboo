package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {

	@Test
	public void verify() {
		int a = 5;
		int b = 15;

		Assert.assertEquals(a, b);
	}
}
