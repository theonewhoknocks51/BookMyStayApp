/**
 * UseCase2RoomInitialization
 *
 * This class demonstrates basic room types using abstraction,
 * inheritance, and static availability.
 *
 * Version: 2.1 (Refactored)
 *
 * @author TITAS
 */
abstract class Room {
    protected String roomType;
    protected int beds;
    protected double price;

    // Constructor
    public Room(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    // Abstract method
    public abstract void displayDetails();
}

// Single Room Class
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 2000);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// Double Room Class
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// Suite Room Class
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 6000);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" Book My Stay - Room Details v2.1 ");
        System.out.println("=======================================");

        // Create room objects (Polymorphism)
        Room single = new SingleRoom();
        Room doub = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display details
        System.out.println("\n--- Single Room ---");
        single.displayDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\n--- Double Room ---");
        doub.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\n--- Suite Room ---");
        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);

        System.out.println("\n=======================================");
        System.out.println(" Application End ");
        System.out.println("=======================================");
    }
}