package com.cognixia.jump.fullstack.classesAndObjects;

public class Cat extends Animal {
	
	// attributes with access modifiers
	private String type;
	private int id;
	
	private static int count = 0;


	// Constructors - you can call a parent constructor, but it is not
	// directly inherited
	public Cat(){
		super(0, "");
		// this = cat1; or whatever object is being made;
		this.type = "";
		count++;
		this.id = count;
	}

	Cat(int weight, String name, String type) {
		// Animal(weight, name);
		super(weight, name);
		this.type = type;
		count++;
		this.id = count;
	}
	
	// Methods
	
	// Override Example
	

//	@Override
	public void move() {
		System.out.println("The cat jumps.");
	}
	
	@Override
	public int noises(String sound, int volume) {
		System.out.println("Cat overrode this method");
		return 1;
	}

	// Method Overload
	// either return type or parameters is changed
	
	public int move(String x, int y) {
		System.out.println("Cat moves x dist " + x + " y dista " + y);
		return 1;
	}
	// this is also overloaded even though we changed the order
	public int move(int y, String x) {
		System.out.println("Cat moves x dist " + x + " y dista " + y);
		return 1;
	}
	
	public static void printCatCount() {
		System.out.println("The number of cats : " + count);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getId() {
		return id;
	}

	public static int getCount() {
		return count;
	}
	
	
}
