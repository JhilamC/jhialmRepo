package com.wiley.helloworld;

/**
 * Hello world!
 *
 */
public class HelloWorld {
	public static void main( String[] args ){
		HelloWorld helloWorld = new HelloWorld("Hello World!");
		helloWorld.printMessage();
	}

	private String message;

	public HelloWorld(String message){
		this.message = message;
	}


	public String printMessage(){
		System.out.println(message);
		return message;
	}  
}
