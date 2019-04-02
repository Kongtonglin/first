package com.ktl.test;

public class Triangle extends Shape{
	@Override public void draw() { System.out.println("Triangle.draw()"); }
		@Override public void erase() { System.out.println("Triangle.erase()"); }
		public void showcode() {System.out.println("is a triangle");} 
}
