
package game;

import java.util.*;     // required for ArrayList
import gameobjects.Actor;
import gameobjects.Room;
import gameobjects.Thing;
import gameobjects.ThingList;
import gameobjects.Treasure;
import globals.Direction;

public class Game implements java.io.Serializable {

    private ArrayList<Room> map; // the map - an ArrayList of Rooms    
    private Actor player;  // the player (house-guest)

    List<String> commands = new ArrayList<>(Arrays.asList(
            "take", "drop", "look", "l", "i", "inventory",
            "n", "s", "w", "e",
            "save", "load"));
    List<String> objects = new ArrayList<>(Arrays.asList("cupcake", "artwork", "tissue",
            "minivan", "bicycle", "detergent", "bills", "chandelier", "sandwich", "game", "pillow", "dictionary", "rose", "banana"));

    public Game() {
        this.map = new ArrayList<Room>(); // Create map a Generic list of Room
        // --- construct a new adventure ---

        ThingList foyerList = new ThingList();
        foyerList.add(new Treasure("cupcake", "It is a very sweet cupcake."));

        ThingList hallwayList = new ThingList();
        hallwayList.add(new Treasure("artwork", "Various pieces of art line the walls."));

        ThingList bathroomList = new ThingList();
        bathroomList.add(new Treasure("tissue", "Hey, it's a pandemic. Take a tissue."));

        ThingList garageList = new ThingList();
        garageList.add(new Treasure("minivan", "Go ahead. Take it for a spin."));
        garageList.add(new Treasure("bicycle", "Alternatively, you may borrow the bicylce. The eco friendly choice."));
        
        ThingList laundryList = new ThingList();
        laundryList.add(new Treasure("detergent", "Liduid detergent to wash clothes."));
        
        ThingList officeList = new ThingList();
        officeList.add(new Treasure("bills", "Statements showing money owed."));
        
        ThingList diningList = new ThingList();
        diningList.add(new Treasure("chandelier", "The dining room centerpiece."));
        
        ThingList kitchenList = new ThingList();
        kitchenList.add(new Treasure("sandwich", "A roast beef sandwich."));
        
        ThingList livingList = new ThingList();
        livingList.add(new Treasure("game", "A gaming console."));
        
        ThingList bedroomList = new ThingList();
        bedroomList.add(new Treasure("pillow", "A large fluffy pillow."));
        
        ThingList libraryList = new ThingList();
        libraryList.add(new Treasure("dictionary", "A book with words and definitions."));
        
        ThingList frontyardList = new ThingList();
        frontyardList.add(new Treasure("rose", "Rosebush has many roses."));
        
        ThingList backyardList = new ThingList();
        backyardList.add(new Treasure("banana", "Banana tree has many bananas."));

        ThingList playerlist = new ThingList();
        /* Room index
         * 0 = foyer
         * 1 = hallway
         * 2 = bathroom
         * 3 = garage
         * 4 = laundry
         * 5 = office
         * 6 = dining
         * 7 = kitchen
         * 8 = living room
         * 9 = bedroom
         * 10 = library
         * 11 = frontyard
         * 12 = backyard
         */
        // Add Rooms to the map
        //                 Room( name,   description,                             N,        S,      W,      E )
        map.add(new Room("Foyer", "An entrance hall in a home used by entrants", 8, 11, 5, 1, foyerList));
        map.add(new Room("Hallway", "An interior passage unto which rooms open", 2, 3, 0, 4, hallwayList));
        map.add(new Room("Bathroom", "A water closet", Direction.NOEXIT, 1, Direction.NOEXIT, Direction.NOEXIT, bathroomList));
        map.add(new Room("Garage", "A large room wherein bicycles and at most two vehicles are stored", 1, Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, garageList));
        map.add(new Room("Laundry", "A small room with a washer and dryer", Direction.NOEXIT, Direction.NOEXIT, 1, Direction.NOEXIT, laundryList));
        map.add(new Room("Office", "A busy room with a messy desk and numerous bookshelves", Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, 0, officeList));
        map.add(new Room("Dining", "A stately room with a large dining table and very tall chairs", 7, Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, diningList));
        map.add(new Room("Kitchen", "An open concept kitchen that combines the kitchen and the living room into one large space", 12, 6, Direction.NOEXIT, 8, kitchenList));
        map.add(new Room("Living Room", "A large bright room equipped with couches, television, game console, and a treasure chest", Direction.NOEXIT, 0, 7, 9, livingList));
        map.add(new Room("Bedroom", "A large room with a dresser, a chest of drawers, and a bed", Direction.NOEXIT, Direction.NOEXIT, 8, 10, bedroomList));
        map.add(new Room("Library", "A large cozy room with bookshelves lined with hundreds of books", Direction.NOEXIT, Direction.NOEXIT, 9, Direction.NOEXIT, libraryList));
        map.add(new Room("Frontyard", "Exits home to the South", 0, Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, frontyardList));
        map.add(new Room("Backyard", "Exits home to the North", Direction.NOEXIT, 7, Direction.NOEXIT, Direction.NOEXIT, backyardList));
        

        // create player and place in Room 0 (i.e. the Room at 0 index of map)
        player = new Actor("player", "a house-guest", playerlist, map.get(0));
    }

    // Access methods
    // Map method
    private ArrayList getMap() {
        return map;
    }

    private void setMap(ArrayList aMap) {
        map = aMap;
    }

    // Player method
    private Actor getPlayer() {
        return player;
    }

    private void setPlayer(Actor aPlayer) {
        player = aPlayer;
    }

    // Take and drop method
    private void transferOb(Thing t, ThingList fromlist, ThingList tolist) {
        fromlist.remove(t);
        tolist.add(t);
    }

    private String takeOb(String obname) {
        String retStr = "";
        Thing t = player.getLocation().getThings().thisOb(obname);
        
        if (obname.equals("")) {
            obname = "nameless object"; // if no object specified
        }
        if (t == null) {
            retStr = "There is no " + obname + " here!";
        } else {
            transferOb(t, player.getLocation().getThings(), player.getThings());
            retStr = obname + " taken!";
        }
        return retStr;
    }

    private String dropOb(String obname) {
        String retStr = "";
        Thing t = player.getThings().thisOb(obname);
        
        if (obname.equals("")) {
            retStr = "You'll have to tell me which object you want to drop!"; // if no object specified
        } else if (t == null) {
            retStr = "You haven't got one of those!";
        } else {
            transferOb(t, player.getThings(), player.getLocation().getThings());
            retStr = obname + " dropped!";
        }
        return retStr;
    }

    // Move a Person to a Room
    private void moveActorTo(Actor p, Room aRoom) {
        p.setLocation(aRoom);
    }

    // Move an Actor in direction 'dir'
    private int moveTo(Actor anActor, Direction dir) {
        // return: Constant representing the room number moved to
        // or NOEXIT
        //
        // try to move any Person (typically but not necessarily player)
        // in direction indicated by dir
        Room r = anActor.getLocation();
        int exit;

        switch (dir) {
            case NORTH:
                exit = r.getN();
                break;
            case SOUTH:
                exit = r.getS();
                break;
            case EAST:
                exit = r.getE();
                break;
            case WEST:
                exit = r.getW();
                break;
            default:
                exit = Direction.NOEXIT; // noexit
                break;
        }
        if (exit != Direction.NOEXIT) {
            moveActorTo(anActor, map.get(exit));
        }
        return exit;
    }

   private void movePlayerTo(Direction dir) {
        // if roomNumber = NOEXIT, display a special message, otherwise
        // display text (e.g. name and description of room)                
        if (moveTo(player, dir) == Direction.NOEXIT) {
            showStr("No Exit!");
        } else {            
            look();
        }
    }

    private void goN() {
        movePlayerTo(Direction.NORTH);
    }

    private void goS() {
        movePlayerTo(Direction.SOUTH);
    }

    private void goW() {
        movePlayerTo(Direction.WEST);
    }

    private void goE() {
        movePlayerTo(Direction.EAST);
    }

    private void look() {
        showStr("You are in the " + getPlayer().getLocation().describe());
    }

    private void showStr(String s) {
        System.out.println(s);
    }    

    private void showInventory() {
        showStr("You have " + getPlayer().getThings().describeThings());
    }
   
    private String processVerb(List<String> wordlist) {
        String verb;
        String msg = "";
        verb = wordlist.get(0);
        if (!commands.contains(verb)) {
            msg = verb + " is not a known verb! ";
        } else {
            switch (verb) {
                case "n":
                    goN();
                    break;
                case "s":
                    goS();
                    break;
                case "w":
                    goW();
                    break;
                case "e":
                    goE();
                    break;
                case "l":
                case "look":
                    look();
                    break;
                case "inventory":
                case "i":
                    showInventory();
                    break;               
                default:
                    msg = verb + " (not yet implemented)";
                    break;
            }
        }
        return msg;
    }

    private String processVerbNoun(List<String> wordlist) {
        String verb;
        String noun;
        String msg = "";
        boolean error = false;
        verb = wordlist.get(0);
        noun = wordlist.get(1);
        if (!commands.contains(verb)) {
            msg = verb + " is not a known verb! ";
            error = true;
        }
        if (!objects.contains(noun)) {
            msg += (noun + " is not a known noun!");
            error = true;
        }
        if (!error) {
            switch (verb) {
                case "take":
                    msg = takeOb(noun);
                    break;
                case "drop":
                    msg = dropOb(noun);
                    break;
                default:
                    msg += " (not yet implemented)";
                    break;
            }
        }
        return msg;
    }

    private String parseCommand(List<String> wordlist) {
        String msg;
        if (wordlist.size() == 1) {
            msg = processVerb(wordlist);
        } else if (wordlist.size() == 2) {
            msg = processVerbNoun(wordlist);
        } else {
            msg = "Only 2 word commands allowed!";
        }
        return msg;
    }

    private static List<String> wordList(String input) {        
        String delims = "[ \t,.:;?!\"']+"; 
        List<String> strlist = new ArrayList<>();      
        String[] words = input.split(delims);
    
        for (String word : words) {
            strlist.add(word);
        }        
        return strlist;
    }

    public void showIntro() {
        String s;
        s = "Welcome to my humble abode. ¡Mi casa es su casa!\n"
                + "You are in the foyer, an entrance hall to the house.\n"
                + "Where would you like to explore?\n" 
                + "[Move 'n', 's', 'w', 'e']?\n" 
                + "[To quit, press 'q']";
        showStr(s);
        look();
    }

    public String runCommand(String inputstr) {
        List<String> wordlist;
        String s = "Goodbye!";
        String lowstr = inputstr.trim().toLowerCase();
        if (!lowstr.equals("q")) {
            if (lowstr.equals("")) {
                s = "You must enter a command";
            } else {
                wordlist = wordList(lowstr);
                s = parseCommand(wordlist);
            }
        }
        return s;
    }

}
