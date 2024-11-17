
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FloorPlanner implements Serializable {

    // Declare the ArrayList to store rooms
    private ArrayList<rooms> rooms;

    // Constructor to initialize the list
    public FloorPlanner() {
        rooms = new ArrayList<>();
    }

    // Getter for the room list
    public ArrayList<rooms> getRoomList() {
        return rooms;
    }

    // Add a room to the list
    public void addRoom(rooms room) {
        rooms.add(room);
    }

    public void file() {
        // List to hold room objects

        // Add sample rooms

        // File to store serialized data
        String filename = "floor_plan.ser";

        // Serialize the list of rooms
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(rooms);
            System.out.println("Floor plan has been serialized and saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize the list of rooms
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Room> deserializedRooms = (List<Room>) ois.readObject();
            System.out.println("Deserialized floor plan:");
            for (Room room : deserializedRooms) {
                System.out.println(room);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}
