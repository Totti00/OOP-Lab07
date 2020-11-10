/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * Represents an enumeration for declaring sports;
 * 
 * 1) Complete the definition of the enumeration.
 * 
 */
public enum Sport {
    BASKET("basket"),
    SOCCER("soccer"),
    TENNIS("tennis"),
    BIKE("bike"),
    F1("f1"),
    MOTOGP("motogp"),
    VOLLEY("volley");
	
	private final String Name;
	
	private Sport(final String name) {
		this.Name = name;
	}

	public String getName() {
		return Name;
	}
	
	public String toString() {
		return this.Name;
	}
	/*
     * declare the following sports: - basket - soccer - tennis - bike - F1 -
     * motogp - volley
     */
}
