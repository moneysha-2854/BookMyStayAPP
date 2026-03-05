/**
 * Abstract representation of a hotel room.
 * This class defines common attributes shared by all room types.
 *
 * @author manisha the great developer
 * @version 2.0
 */
public abstract class BookMyStayApp {

    private String roomType;
    private int numberOfBeds;
    private int roomSize;
    private double pricePerNight;

    public BookMyStayApp(String roomType, int numberOfBeds, int roomSize, double pricePerNight) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Room Size: " + roomSize + " sq ft");
        System.out.println("Price per Night: $" + pricePerNight);
    }
}