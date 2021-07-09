
package gameobjects;


public class Treasure extends Thing implements java.io.Serializable{
    /*
    Subclass of Thing class.
    Treasure adds on an int value and a get accessor but not a set
    accessor since the value of each Treasure never varies - it is
    set just once when the object is constructed.
    */

    private int value;

    public Treasure(String aName, String aDescription) {
        super(aName, aDescription); // init superclass
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

}
