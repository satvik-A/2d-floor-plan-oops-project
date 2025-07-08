import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Array implements Serializable {
    file f = new file(null);
    ArrayList<roomsave> roomsave = new ArrayList<>();
    ArrayList<furnituresave> furnituresave1 = new ArrayList<>();
    ArrayList<furnituresave> doors = new ArrayList<>();

    public void setfname(String n) {
        f.setfilename(n);
    }

    public String getfname() {
        return f.getfilename();
    }

    private JLabel selectedroom;
    private Point initialClick;
    private Point PrevCoord;

    public ArrayList getdata() {
        return roomsave;
    }

    public void setroom(JPanel panel, String type) {
        roomsave.add(new roomsave(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight(),
                panel.getBackground(), panel.getName(), type, panel));

        System.out.println("proom is added to roomsave array");

    }

    public void loadroom() {

    }

    public String getroomtype(String roomname) {
        for (roomsave newpanel : roomsave) {
            if (newpanel.getname() == roomname) {
                return newpanel.gettype();
            }
        }
        return null;
    }

    public void setfurniture(JLabel label, String roomname, String roomtype) {
        furnituresave1.add(new furnituresave(roomname, roomtype, label.getText(), label.getX(), label.getY(), label));

        for (roomsave newpanel : roomsave) {
            if (newpanel.getname() == roomname) {
                // newpanel.add(label);
                newpanel.updatepanel(label);
            }
        }

    }

    public void setdoor(JLabel label, String roomname, String roomtype) {
        doors.add(new furnituresave(roomname, roomtype, label.getText(), label.getX(), label.getY(), label));

        for (roomsave newpanel : roomsave) {
            if (newpanel.getname() == roomname) {
                // newpanel.add(label);
                newpanel.updatepanel(label);
            }
        }

    }

    public JPanel getRoomPanel(String roomname) {
        {
            for (roomsave newpanel : roomsave) {
                if (newpanel.getname() == roomname) {
                    return newpanel.getpanel();
                }
            }
            return null;
        }
    }

    public void panelUpdate(int x, int y, JPanel panel, String roomname) {
        for (roomsave newpanel : roomsave) {
            if (newpanel.getname() == roomname) {
                newpanel.setx(x);
                newpanel.sety(y);
                newpanel.setpanel(panel);
            }
        }
    }

    public JPanel getRoompanel(String roomname) {
        for (roomsave newpanel : roomsave) {
            if (newpanel.getname() == roomname) {
                return newpanel.getpanel();
            }
        }
        return null;
    }

    public ArrayList<roomsave> roomarray() {
        return roomsave;
    }

    public boolean checkOverlaps(JPanel newPanel) {
        // Get the bounds of the new panel
        Rectangle newBounds = new Rectangle(newPanel.getX(), newPanel.getY(), newPanel.getWidth(),
                newPanel.getHeight());

        // Check against each saved room
        for (roomsave savedRoom : roomsave) {
            // Get the bounds of the saved room
            if (savedRoom.getname() != newPanel.getName()) {
                Rectangle existingBounds = new Rectangle(
                        savedRoom.getx(),
                        savedRoom.gety(),
                        savedRoom.getlength(),
                        savedRoom.getheight());

                // Check if the bounds intersect
                if (newBounds.intersects(existingBounds)) {
                    System.out.println("Overlap detected with room: " + savedRoom.getname());
                    JOptionPane.showMessageDialog(null, "Overlap detected with room: " + savedRoom.getname(), "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return true; // Overlap detected
                }
            }
        }

        return false; // No overlaps
    }

    public boolean checkOverlapsml(JPanel newPanel1, int x, int y) {
        JPanel newPanel = newPanel1;
        int q = newPanel1.getX();
        int w = newPanel1.getY();
        newPanel.setLocation(x, y);

        // Get the bounds of the new panel
        Rectangle newBounds = new Rectangle(newPanel.getX(), newPanel.getY(), newPanel.getWidth(),
                newPanel.getHeight());
        int h = 0;

        // Check against each saved room
        for (roomsave savedRoom : roomsave) {
            if (savedRoom.getname() != newPanel.getName()) {
                // Get the bounds of the saved room
                Rectangle existingBounds = new Rectangle(
                        savedRoom.getx(),
                        savedRoom.gety(),
                        savedRoom.getlength(),
                        savedRoom.getheight());

                // Check if the bounds intersect
                if (newBounds.intersects(existingBounds)) {
                    newPanel1.setLocation(q, w);

                    System.out.println("Overlap detected with room: " + savedRoom.getname());
                    JOptionPane.showMessageDialog(null, "Overlap detected with room: " + savedRoom.getname(),
                            "Overlap detected", JOptionPane.ERROR_MESSAGE);
                    h++;

                    return true; // Overlap detected
                } else {
                    newPanel.setLocation(x, y);

                }
            }
        }
        if (h > 0) {
            newPanel1.setLocation(q, w);
        } else {
            newPanel.setLocation(x, y);
            for (roomsave savedRoom : roomsave) {
                if (savedRoom.getname() == newPanel.getName()) {
                    savedRoom.setx(newPanel.getX());
                    savedRoom.sety(newPanel.getY());

                }

            }
        }

        return false; // No overlaps

    }

    public boolean doorOverlap(JLabel newLabel, String roomname) {
        Rectangle newBounds = new Rectangle(newLabel.getX(), newLabel.getY(), newLabel.getWidth(),
                newLabel.getHeight());

        for (Object obj : doors) {
            if (obj instanceof furnituresave) {
                furnituresave savedFur = (furnituresave) obj;
                System.out.println(
                        savedFur.getheightfur() + "\n" + savedFur.getlengthfur() + "\n" + savedFur.getxpos() + "\n"
                                + savedFur.getypos());

                // Check if the room name matches
                if (savedFur.getnameroom().equals(roomname)) {
                    Rectangle existingBounds = new Rectangle(
                            savedFur.getxpos(),
                            savedFur.getypos(),
                            savedFur.getlengthfur(),
                            savedFur.getheightfur());

                    System.out.println("initially checking for selected label overlapping");

                    // Check if the bounds intersect
                    if (newBounds.intersects(existingBounds)) {
                        System.out.println("Overlap detected with door: " + savedFur.getfurniturename());
                        JOptionPane.showMessageDialog(null, "Error!", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("initial Overlapping");
                        return true; // Overlap detected
                    } else {

                    }
                }
            } else {
                System.out.println("Skipping non-furnituresave object: " + obj.getClass().getName());
            }
        }
        System.out.println("initially no overlap");
        return false; // No overlaps
    }

    public boolean furnitureOverlaps(JLabel newLabel, String roomname) {
        // Get the bounds of the new label
        Rectangle newBounds = new Rectangle(newLabel.getX(), newLabel.getY(), newLabel.getWidth(),
                newLabel.getHeight());
        System.out.println(furnituresave1.size());

        // Check against each saved furniture
        for (Object obj : furnituresave1) {
            if (obj instanceof furnituresave) {
                furnituresave savedFur = (furnituresave) obj;
                System.out.println(
                        savedFur.getheightfur() + "\n" + savedFur.getlengthfur() + "\n" + savedFur.getxpos() + "\n"
                                + savedFur.getypos());

                // Check if the room name matches
                if (savedFur.getnameroom().equals(roomname)) {
                    Rectangle existingBounds = new Rectangle(
                            savedFur.getxpos(),
                            savedFur.getypos(),
                            savedFur.getlengthfur(),
                            savedFur.getheightfur());

                    System.out.println("initially checking for selected label overlapping");

                    // Check if the bounds intersect
                    if (newBounds.intersects(existingBounds)) {
                        System.out.println("Overlap detected with room: " + savedFur.getfurniturename());
                        JOptionPane.showMessageDialog(null, "Error!", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("initial Overlapping");
                        return true; // Overlap detected
                    } else {

                    }
                }
            } else {
                System.out.println("Skipping non-furnituresave object: " + obj.getClass().getName());
            }
        }
        System.out.println("initially no overlap");
        return false; // No overlaps
    }

    public boolean furnitureOverlapsml(JLabel newLabel, int x, int y, String roomname) {
        // Get the bounds of the new label
        JLabel newLabel1 = newLabel;
        int q = newLabel.getX();
        int w = newLabel.getY();
        newLabel.setLocation(x, y);

        Rectangle newBounds = new Rectangle(newLabel.getX(), newLabel.getY(), newLabel.getWidth(),
                newLabel.getHeight());
        int h = 0;
        System.out.println(furnituresave1.size());

        // Check against each saved furniture
        for (furnituresave savedFur : furnituresave1) {
            // Get the bounds of the saved furniture
            if (savedFur.getnameroom() == roomname && savedFur.getfurniturename() != newLabel.getName()) {
                Rectangle existingBounds = new Rectangle(
                        savedFur.getxpos(),
                        savedFur.getypos(),
                        savedFur.getlengthfur(),
                        savedFur.getheightfur());
                System.out.println("checking for oberlapping mouse listener");
                System.out.println(
                        savedFur.getheightfur() + "\n" + savedFur.getlengthfur() + "\n" + savedFur.getxpos() + "\n"
                                + savedFur.getypos());

                // Check if the bounds intersect
                if (newBounds.intersects(existingBounds)) {
                    newLabel1.setLocation(q, w);
                    System.out.println("Overlap detected with room: " + savedFur.getfurniturename());
                    JOptionPane.showMessageDialog(null, "Error!", "Error", JOptionPane.ERROR_MESSAGE);
                    h++;

                    return true; // Overlap detected
                }
            }
        }
        if (h > 0) {
            System.out.println("overlapped mouse listener");
            newLabel1.setLocation(q, w);
        } else {
            System.out.println("no overlap mouse listener");
            newLabel.setLocation(x, y);
            for (furnituresave savedFur : furnituresave1) {
                if (savedFur.getfurniturename() == newLabel.getName()) {
                    savedFur.setxpos(newLabel.getX());
                    savedFur.setypos(newLabel.getY());
                }
            }
        }
        return false; // No overlaps
    }

    public String[] getroomnames() {
        String[] roomnames = new String[roomsave.size()];
        for (roomsave newpanel : roomsave) {
            roomnames[roomsave.indexOf(newpanel)] = newpanel.getname();
        }
        return roomnames;
    }

    public void addfurniture(furnituresave fs) {
        for (roomsave newpanel : roomsave) {
            if (fs.getnameroom() == newpanel.getname()) {
                newpanel.getpanel().add(fs.getlabel());

                fs.getlabel().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        selectedroom = fs.getlabel();
                        initialClick = e.getPoint();
                        PrevCoord = ((JLabel) e.getSource()).getLocation();
                    }
                });
                fs.getlabel().addMouseMotionListener(new MouseAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        moveRoom(e, (String) fs.getnameroom());
                    }
                });

                newpanel.getpanel().revalidate();
                newpanel.getpanel().repaint();
            }
        }

    }

    private void moveRoom(MouseEvent e, String roomname) {
        if (selectedroom != null) {
            // Temporarily set floor layout to null for free dragging

            // Calculate the new location
            int thisX = selectedroom.getX();
            int thisY = selectedroom.getY();

            // Get the offset based on initial click
            int xMoved = e.getX() - initialClick.x;
            int yMoved = e.getY() - initialClick.y;

            // Move the room to the new location
            int newX = thisX + xMoved;
            int newY = thisY + yMoved;
            if (!furnitureOverlapsml(selectedroom, newX, newY, roomname)) {
                // selectedroom.setLocation(newX, newY);
            }
            ;

            // Refresh the container to show the updated location

        }
    }

}