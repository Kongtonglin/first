package com.ktl.test;
class Cycle {
	private String name = "Cycle";
	public static void travel(Cycle c) {
		System.out.println("Cycle.ride() " + c);
	}
	public String toString() {
		return this.name;
	}
	public  void wheels() {
		System.out.println("how many wheels");
	}
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	public String toString() {
		return this.name;
	}
	public  void wheels() {
		System.out.println("how many wheels is one");
	}
}

class Bicycle extends Cycle {
	private String name = "Bicycle";
	public String toString() {
		return this.name;
	}	
	public  void wheels() {
		System.out.println("how many wheels is two");
	}

}
class Object{

	@Override
	public String toString() {
		return "Object []";
	}
	
}
class Tricycle extends Cycle {
	private String name = "Tricycle";
	public String toString() {
		return this.name;
	}	
	public  void wheels() {
		System.out.println("how many wheels is three");
	}
}

public class Biking {
	public static void ride(Cycle c) {
		c.wheels();
	}
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u);
		ride(b);
		ride(t);		
	}
}