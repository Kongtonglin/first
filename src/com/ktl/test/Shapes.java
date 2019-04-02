package com.ktl.test;
  class PP extends Shape{
	@Override public void draw() { System.out.println("p'p.draw()"); }
	@Override public void erase() { System.out.println("p'p.erase()"); }
	public void showcode() {System.out.println("is a p'p");} 
}
public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[10];
		// fill up the array wth shapes:
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// make polymorphic method calls:
		for(Shape shp : s) {
		
			shp.draw();		
			shp.showcode();
		}
	}
}
