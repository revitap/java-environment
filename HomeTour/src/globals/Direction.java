
package globals;

public enum Direction {
    NORTH, 
    SOUTH, 
    EAST, 
    WEST;
    /*
        NOEXIT has an integer value. All valid entries indicate a Room number
        whereas NOEXIT is -1.
    */
    public static final int NOEXIT = -1;
};