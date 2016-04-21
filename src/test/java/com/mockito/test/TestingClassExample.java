package com.mockito.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import testClases.Flower;

//To get annotations to function, you need to either call MockitoAnnotations.initMocks( testClass ) (usually in a @Before method ) or use MockitoJUnit4Runner as a JUnit runner.
@RunWith(MockitoJUnitRunner.class)
public class TestingClassExample {

	// Flower flowerMock=Mockito.mock(Flower.class); or
	@Mock
	private Flower flowerMock;

	@Test
	public void testExample() {

	}
}
