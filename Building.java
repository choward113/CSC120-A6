/**
 * A class representing a building.
*/
public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Accessor for name 
     * @return Returns a string representation of the name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor for address
     * @return Returns a string representation of the address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor for the number of floors
     * @return Returns an integer representation of the number of floors
     */
    public int getFloors() {
        return this.nFloors;
    }
    
    /**
     * Returns a string representation of the building
     * @return Returns a string containing the name, number of floors, and address of the building.
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
    }

}