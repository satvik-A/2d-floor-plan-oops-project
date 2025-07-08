import java.awt.Rectangle;
import javax.swing.JLabel;

class funitureOverlap {
    Array arr;

    funitureOverlap(Array array) {
        arr = array;
    }

    public boolean isNonOverlapping(String roomName, JLabel newLabel) {
        // Get the panel associated with the room name from roomsave
        roomsave roomData = null;
        for (roomsave room : arr.roomsave) {
            if (room.getname().equals(roomName)) {
                roomData = room;
                break;
            }
        }

        // If no matching room is found, assume non-overlapping (since panel doesn't
        // exist)
        if (roomData == null) {
            System.out.println("Room not found: " + roomName);
            return true;
        }

        // Get the bounds of the new JLabel
        Rectangle newBounds = new Rectangle(
                newLabel.getX(),
                newLabel.getY(),
                newLabel.getWidth(),
                newLabel.getHeight());

        // Check against all other furniture in the same room
        for (furnituresave existingFurniture : arr.furnituresave1) {
            // Ensure the furniture belongs to the same room
            if (existingFurniture.getnameroom().equals(roomName)) {
                // Get the bounds of the existing JLabel
                Rectangle existingBounds = new Rectangle(
                        existingFurniture.getxpos(),
                        existingFurniture.getypos(),
                        existingFurniture.getlengthfur(),
                        existingFurniture.getheightfur());
                System.out.println(existingFurniture.getxpos()
                        + existingFurniture.getypos()
                        + existingFurniture.getlengthfur()
                        + existingFurniture.getheightfur() + " ///////////////");

                // Check if the bounds intersect
                if (newBounds.intersects(existingBounds)) {
                    System.out.println("Overlap detected with furniture: " + existingFurniture.getfurniturename());
                    return false; // Overlap found
                }
            }
        }

        // No overlaps detected
        return true;
    }
}