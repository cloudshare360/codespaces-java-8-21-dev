/**
 * 
 */
package com.eazybytes.java8.defaultmethods;

/**
 * @author EazyBytes
 *
 */
public interface Vehicle {

	public int getSpeed();

	public void applyBreak();

	public default void autoPilot() {
		System.out.println("Default Method: I will help in driving with out manual support");
	}

	public static void sayHello() {
		System.out.println("Hi, This is your favorite car");
	}
}
