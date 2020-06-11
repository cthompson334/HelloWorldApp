package com.cognixia.jump.fullstack.enums;

public enum Grade {
	
	FRESHMAN, SOPHMORE, JUNIOR, SENIOR;
	
	// An Enum's constructor is run once for each value. This statement will print
	Grade() {
		System.out.println("A " + this.toString() + " has been in high school for " + (this.ordinal() +1) + " year(s)");
		
	}
	
	public void hello() {
		System.out.println("Hello this student is a " + this.toString());
	}

}
