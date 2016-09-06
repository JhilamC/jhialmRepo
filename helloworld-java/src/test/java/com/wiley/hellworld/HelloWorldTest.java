package com.wiley.hellworld;

import junit.framework.TestCase;
import com.wiley.hellworld.HelloWorld;

public class HelloWorldTest  extends TestCase {

	public HelloWorldTest(String name) {
		super( name );
	}

	public void testHelloWorld() throws Exception {
		String testMessage="Hello World!!!!";
		HelloWorld helloWorld = new HelloWorld("Hello World!");
		assertEquals(testMessage,helloWorld.printMessage());
	}
}
