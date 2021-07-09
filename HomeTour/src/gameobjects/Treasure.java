
package gameobjects;


public class Treasure extends Thing implements java.io.Serializable{
    /*
    Subclass of Thing class.
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
