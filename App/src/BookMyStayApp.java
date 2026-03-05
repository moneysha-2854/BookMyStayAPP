import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory manages centralized availability of rooms
 * using a HashMap data structure.
 *
 * This class ensures that all room availability information
 * is stored and accessed from a single source of truth.
 *
 * @manisha
 *
 * @version 3.0
 */
public class BookMyStayApp {

    // HashMap to store room type and availability
    private Map<String, Integer> inventory;

    /**
     * Constructor initializes the room inventory
     * with predefined room types and availability.
     */
    public BookMyStayApp() {
        inventory = new HashMap<>();

        // Register room types with initial availability
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    /**
     * Returns the availability of a given room type
     */
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    /**
     * Updates the availability for a given room type
     */
    public void updateAvailability(String roomType, int newCount) {
        if (inventory.containsKey(roomType)) {
            inventory.put(roomType, newCount);
        } else {
            System.out.println("Room type not found in inventory.");
        }
    }

    /**
     * Displays the entire inventory
     */
    public void displayInventory() {
        System.out.println("Current Room Inventory:");
        System.out.println("---------------------------");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }

        System.out.println("---------------------------");
    }
}