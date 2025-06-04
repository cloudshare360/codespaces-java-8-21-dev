/**
 * 
 */
package com.eazybytes.java8.defaultmethods;

/**
 * @author EazyBytes
 *
 */
public class Honda implements Vehicle {

	@Override
	public int getSpeed() {
		return 100;
	}

	@Override
	public void applyBreak() {
		System.out.println("Breaks applied");
	}

	// Default Methods
	@Override
	public void autoPilot() {
		System.out.println("Default Method: Honda Auto pilot applied");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.applyBreak();
		// default method
		honda.autoPilot();
		Vehicle.sayHello();
		Honda.sayHello();
	}

	private static void sayHello() {
		System.out.println("Hi, This is your favourite honda car");
	}
}
