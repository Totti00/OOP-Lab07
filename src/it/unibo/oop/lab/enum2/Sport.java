/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	BASKET(5, "basket", Place.Indoor),
    SOCCER(11, "soccer", Place.Outdoor),
    TENNIS(1, "tennis", Place.Outdoor),
    BIKE(1, "bike", Place.Outdoor),
    F1(1, "f1", Place.Outdoor),
    MOTOGP(1, "motogp", Place.Outdoor),
    VOLLEY(6, "volley", Place.Indoor);
	
    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	private final Place place;
	private final int nMember;
	private final String nTeam;
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private Sport(final int noTeamMembers, final String actualName, final Place place) {
		this.place = place;
		this.nMember = noTeamMembers;
		this.nTeam = actualName;
	}

	public Place getPlace() {
		return this.place;
	}

	public String toString() {
		return "Sport [NameTeam()=" + this.nTeam + ", NumberOfMember()="
				+ this.nMember + ", Place=" + this.place + "]";
	}
	
	public boolean isIndividualSport(final Sport s) {
		return s.nMember == 1;
	}
	
	public boolean isIndoorSport(final Sport s) {
		return s.place == Place.Indoor;
	}

	public int getnMember() {
		return this.nMember;
	}

	public String getnTeam() {
		return this.nTeam;
	}
	
	
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */

	
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
}
