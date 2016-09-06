package com.wiley.helloworld;

import com.wiley.helloworld.HelloWorld;

import junit.framework.TestCase;

public class HelloWorldTest  extends TestCase {

	public HelloWorldTest(String name) {
		super( name );
	}

	public void testHelloWorld() throws Exception {
		String testMessage="Hello World!";
		HelloWorld helloWorld = new HelloWorld("Hello World!");
		assertEquals(testMessage,helloWorld.printMessage());
	}
}
