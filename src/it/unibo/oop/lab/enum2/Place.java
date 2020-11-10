package it.unibo.oop.lab.enum2;

public enum Place {
	Indoor("dentro"), 
	Outdoor("fuori");
	
	private String method;
	
	private Place(final String name) {
		this.method = name;
	}

	public String getMethod() {
		return this.method;
	}
	
	public String toString() {
		return this.method;
	}
}

