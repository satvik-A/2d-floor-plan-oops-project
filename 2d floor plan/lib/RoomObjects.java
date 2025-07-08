import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RoomObjects {
    Array arr;
    mainModel m;

    RoomObjects(Array array) {
        arr = array;

    }

    funitureOverlap fo = new funitureOverlap(arr);

    JLabel selectedRoom;
    Point initialClick;
    Point PrevCoord;

    ImageIcon Bed_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/bed_north.png");
    ImageIcon Bed_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/bed_east.png");
    ImageIcon Bed_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/bed_south.png");
    ImageIcon Bed_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/bed_west.png");

    ImageIcon Table_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/tabel_north_south_east_west.jpg");
    ImageIcon Table_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/tabel_north_south_east_west.jpg");
    ImageIcon Table_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/tabel_north_south_east_west.jpg");
    ImageIcon Table_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/tabel_north_south_east_west.jpg");

    ImageIcon Sofa_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/couch_north.png");
    ImageIcon Sofa_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/couch_east.png");
    ImageIcon Sofa_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/couch_south.png");
    ImageIcon Sofa_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/couch_west.png");

    ImageIcon Chair_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/chair_north.png");
    ImageIcon Chair_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/chair_east.png");
    ImageIcon Chair_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/chair_south.png");
    ImageIcon Chair_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/chair_west.png");

    ImageIcon diningSet_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/diningtable_north_south.png");
    ImageIcon diningSet_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/diningtable_west_east.png");
    ImageIcon diningSet_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/diningtable_north_south.png");
    ImageIcon diningSet_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/diningtable_west_east.png");

    ImageIcon Commode_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/cammode_north.png");
    ImageIcon Commode_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/cammode_east.png");
    ImageIcon Commode_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/cammode_south.png");
    ImageIcon Commode_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/cammode_west.png");

    ImageIcon Sink_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/sink_north.jpg");
    ImageIcon Sink_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/sink_east.jpg");
    ImageIcon Sink_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/sink_south.jpg");
    ImageIcon Sink_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/sink_west.jpg");

    ImageIcon Shower_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/shower_north.png");
    ImageIcon Shower_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/shower_east.png");
    ImageIcon Shower_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/shower_south.png");
    ImageIcon Shower_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/shower_west.png");

    ImageIcon stove_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/stove_north.png");
    ImageIcon stove_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/stove_east.png");
    ImageIcon stove_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/stove_south.png");
    ImageIcon stove_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/stove_west.png");

    ImageIcon Washbasin_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/washbasin_north.png");
    ImageIcon Washbasin_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/washbasin_east.png");
    ImageIcon Washbasin_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/washbasin_south.png");
    ImageIcon Washbasin_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/washbasin_west.png");

    ImageIcon Fridge_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/refrigerator_north.png");
    ImageIcon Fridge_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/refrigerator_east.png");
    ImageIcon Fridge_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/refrigerator_south.png");
    ImageIcon Fridge_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/refrigerator_west.png");

    ImageIcon Door_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/door _north.jpg");
    ImageIcon Door_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/door _east.jpg");
    ImageIcon Door_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/door _south.jpg");
    ImageIcon Door_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/refrigerator_west.png");

    ImageIcon Window_north = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/window_north.png");
    ImageIcon Window_east = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/window_east.png");
    ImageIcon Window_south = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/window_south.png");
    ImageIcon Window_west = new ImageIcon(
            "/Users/aderlasatvik/Downloads/java/2d-floor-plan-oops-project/2d floor plan/lib/door _west.jpg");

    public roomsave addfurn(String selectedFurniture) {
        frame fbed = new frame();
        fbed.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fbed.setBackground(Color.BLACK);
        fbed.setSize(100, 400);
        fbed.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfbed = new JTextField("Enter the name of the bed", 20);
        JTextField tfXbed = new JTextField("Enter the horizontal - position of the bed", 20);
        JTextField tfYbed = new JTextField("Enter the vertical - position of the bed", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        fbed.add(tfbed);
        fbed.add(cbroom);
        fbed.add(tfXbed);
        fbed.add(tfYbed);
        fbed.add(cbposition);
        fbed.add(submit);
        fbed.pack();

        fbed.setVisible(true);
        return null;
    }

    public JLabel Bed() {

        frame fbed = new frame();
        fbed.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fbed.setBackground(Color.BLACK);
        fbed.setSize(100, 400);
        fbed.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfbed = new JTextField("Enter the name of the bed", 20);
        JTextField tfXbed = new JTextField("Enter the horizontal - position of the bed", 20);
        JTextField tfYbed = new JTextField("Enter the vertical - position of the bed", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        JLabel labelbed = new JLabel();
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelbed.setName(tfbed.getText());
                    labelbed.setText(tfbed.getText());
                    labelbed.setHorizontalTextPosition(JLabel.CENTER);
                    labelbed.setVerticalTextPosition(JLabel.CENTER);
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if (((Integer.parseInt(tfXbed.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYbed.getText()) * 50 + 123) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "bed cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelbed.setBounds(Integer.parseInt(tfXbed.getText()) * 50,
                                            Integer.parseInt(tfYbed.getText()) * 50,
                                            100,
                                            123);
                                    labelbed.setIcon(Bed_north);

                                }

                                break;
                            case "South":

                                if (((Integer.parseInt(tfXbed.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYbed.getText()) * 50 + 123) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "sofa cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelbed.setBounds(Integer.parseInt(tfXbed.getText()) * 50,
                                            Integer.parseInt(tfXbed.getText()) * 50,
                                            100,
                                            123);
                                    labelbed.setIcon(Bed_south);
                                }
                                break;
                            case "East":

                                if (((Integer.parseInt(tfXbed.getText()) * 50 + 123) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYbed.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "bed cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelbed.setBounds(
                                            Integer.parseInt(tfXbed.getText()) * 50,
                                            Integer.parseInt(tfYbed.getText()) * 50,
                                            123,
                                            100);
                                    labelbed.setIcon(Bed_east);
                                }
                                break;
                            case "West":

                                if (((Integer.parseInt(tfXbed.getText()) * 50 + 123) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYbed.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "bed cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelbed.setBounds(
                                            Integer.parseInt(tfXbed.getText()) * 50,
                                            Integer.parseInt(tfYbed.getText()) * 50,
                                            123,
                                            100);
                                    labelbed.setIcon(Bed_west);
                                }
                                break;

                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("bed has been printed");
                    labelbed.setHorizontalAlignment(JLabel.CENTER);
                    labelbed.setVerticalAlignment(JLabel.CENTER);
                    labelbed.setOpaque(true);
                    labelbed.setVisible(true);

                    if (!arr.furnitureOverlaps(labelbed, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelbed, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelbed);
                            }
                        }
                        System.out.println("labelbed is passed to  array and added to panel");
                    } else {
                        System.out.println("labelbed overlaps with existing furniture");
                    }

                    labelbed.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelbed;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();
                        }
                    });
                    labelbed.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fbed.add(tfbed);
        fbed.add(cbroom);
        fbed.add(tfXbed);
        fbed.add(tfYbed);
        fbed.add(cbposition);
        fbed.add(submit);
        fbed.pack();

        fbed.setVisible(true);

        return labelbed;
    }

    public JLabel Table() {
        frame ftable = new frame();
        ftable.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ftable.setSize(580, 400);
        ftable.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tftable = new JTextField("Enter the name of the table", 20);
        JTextField tfXtable = new JTextField("Enter the horizontal - position of the table", 20);
        JTextField tfYtable = new JTextField("Enter the vertical - position of the table", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        JLabel labeltable = new JLabel();
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {
                    funitureOverlap fo = new funitureOverlap(arr);

                    labeltable.setName(tftable.getText());
                    labeltable.setText(tftable.getText());
                    labeltable.setHorizontalTextPosition(JLabel.CENTER);
                    labeltable.setVerticalTextPosition(JLabel.CENTER);
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if (((Integer.parseInt(tfXtable.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYtable.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "table cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeltable.setBounds(Integer.parseInt(tfXtable.getText()) * 50,
                                            Integer.parseInt(tfYtable.getText()) * 50,
                                            100,
                                            100);
                                    labeltable.setIcon(Table_north);

                                }

                                break;
                            case "South":

                                if (((Integer.parseInt(tfXtable.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYtable.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "table cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeltable.setBounds(Integer.parseInt(tfXtable.getText()) * 50,
                                            Integer.parseInt(tfXtable.getText()) * 50,
                                            100,
                                            100);
                                    labeltable.setIcon(Table_south);
                                }
                                break;
                            case "East":

                                if (((Integer.parseInt(tfXtable.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYtable.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "table cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeltable.setBounds(
                                            Integer.parseInt(tfXtable.getText()) * 50,
                                            Integer.parseInt(tfYtable.getText()) * 50,
                                            100,
                                            100);
                                    labeltable.setIcon(Table_east);
                                }
                                break;
                            case "West":

                                if (((Integer.parseInt(tfXtable.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYtable.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "table cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeltable.setBounds(
                                            Integer.parseInt(tfXtable.getText()) * 50,
                                            Integer.parseInt(tfYtable.getText()) * 50,
                                            100,
                                            100);
                                    labeltable.setIcon(Table_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("table has been printed");
                    labeltable.setHorizontalAlignment(JLabel.CENTER);
                    labeltable.setVerticalAlignment(JLabel.CENTER);
                    labeltable.setOpaque(true);
                    labeltable.setVisible(true);

                    System.out.println(!arr.furnitureOverlaps(labeltable, (String) cbroom.getSelectedItem()));

                    if (!arr.furnitureOverlaps(labeltable, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labeltable, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labeltable);
                            }
                        }
                        System.out.println("labeltable is passed to  array and added to panel");
                    } else {
                        System.out.println("labeltable overlaps with existing furniture");
                    }
                    labeltable.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labeltable;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();
                        }
                    });
                    labeltable.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        ftable.add(tftable);
        ftable.add(cbroom);
        ftable.add(tfXtable);
        ftable.add(tfYtable);
        ftable.add(cbposition);
        ftable.add(submit);
        ftable.pack();
        ftable.setVisible(true);

        // Return the panel
        return labeltable;
    }

    public JLabel Sofa() {

        frame fsofa = new frame();
        fsofa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fsofa.setSize(580, 400);
        fsofa.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfsofa = new JTextField("Enter the name of the sofa", 20);
        JTextField tfXsofa = new JTextField("Enter the horizontal - position of the sofa", 20);
        JTextField tfYsofa = new JTextField("Enter the vertical - position of the sofa", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);
        String name = (String) cbroom.getSelectedItem();

        JLabel labelsofa = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelsofa.setName(tfsofa.getText());
                    labelsofa.setText(tfsofa.getText());
                    labelsofa.setHorizontalTextPosition(JLabel.CENTER);
                    labelsofa.setVerticalTextPosition(JLabel.CENTER);
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if (((Integer.parseInt(tfXsofa.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYsofa.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "sofa cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsofa.setBounds(Integer.parseInt(tfXsofa.getText()) * 50,
                                            Integer.parseInt(tfYsofa.getText()) * 50,
                                            100,
                                            100);
                                    labelsofa.setIcon(Sofa_north);

                                }

                                break;
                            case "South":

                                if (((Integer.parseInt(tfXsofa.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYsofa.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "sofa cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsofa.setBounds(Integer.parseInt(tfXsofa.getText()) * 50,
                                            Integer.parseInt(tfXsofa.getText()) * 50,
                                            100,
                                            100);
                                    labelsofa.setIcon(Sofa_south);
                                }
                                break;
                            case "East":

                                if (((Integer.parseInt(tfXsofa.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYsofa.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "sofa cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsofa.setBounds(
                                            Integer.parseInt(tfXsofa.getText()) * 50,
                                            Integer.parseInt(tfYsofa.getText()) * 50,
                                            100,
                                            100);
                                    labelsofa.setIcon(Sofa_east);
                                }
                                break;
                            case "West":

                                if (((Integer.parseInt(tfXsofa.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYsofa.getText()) * 50 + 100) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "sofa cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsofa.setBounds(
                                            Integer.parseInt(tfXsofa.getText()) * 50,
                                            Integer.parseInt(tfYsofa.getText()) * 50,
                                            100,
                                            100);
                                    labelsofa.setIcon(Sofa_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("sofa has been printed");
                    labelsofa.setHorizontalAlignment(JLabel.CENTER);
                    labelsofa.setVerticalAlignment(JLabel.CENTER);
                    labelsofa.setOpaque(true);
                    labelsofa.setVisible(true);
                    if (!arr.furnitureOverlaps(labelsofa, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelsofa, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelsofa);
                            }
                        }
                        System.out.println("labelsofa is passed to  array and added to panel");
                    } else {
                        System.out.println("labelsofa overlaps with existing furniture");
                    }

                    labelsofa.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelsofa;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelsofa.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fsofa.add(tfsofa);
        fsofa.add(cbroom);
        fsofa.add(tfXsofa);
        fsofa.add(tfYsofa);
        fsofa.add(cbposition);
        fsofa.add(submit);
        fsofa.pack();
        fsofa.setVisible(true);

        // Return the panel
        return labelsofa;

    }

    public JLabel Chair() {

        frame fchair = new frame();
        fchair.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fchair.setSize(580, 400);
        fchair.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfchair = new JTextField("Enter the name of the chair", 20);
        JTextField tfXchair = new JTextField("Enter the horizontal - position of the chair", 20);
        JTextField tfYchair = new JTextField("Enter the vertical - position of the chair", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labelchair = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelchair.setName(tfXchair.getText());
                    labelchair.setText(tfXchair.getText());
                    labelchair.setHorizontalTextPosition(JLabel.CENTER);
                    labelchair.setVerticalTextPosition(JLabel.CENTER);
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if (((Integer.parseInt(tfXchair.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYchair.getText()) * 50 + 90) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "chair cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelchair.setBounds(Integer.parseInt(tfXchair.getText()) * 50,
                                            Integer.parseInt(tfYchair.getText()) * 50,
                                            90,
                                            90);
                                    labelchair.setIcon(Chair_north);

                                }

                                break;
                            case "South":

                                if (((Integer.parseInt(tfXchair.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYchair.getText()) * 50 + 90) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "chair cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelchair.setBounds(Integer.parseInt(tfXchair.getText()) * 50,
                                            Integer.parseInt(tfXchair.getText()) * 50,
                                            90,
                                            90);
                                    labelchair.setIcon(Chair_south);
                                }
                                break;
                            case "East":

                                if (((Integer.parseInt(tfXchair.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYchair.getText()) * 50 + 90) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "chair cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelchair.setBounds(
                                            Integer.parseInt(tfXchair.getText()) * 50,
                                            Integer.parseInt(tfYchair.getText()) * 50,
                                            90,
                                            90);
                                    labelchair.setIcon(Chair_east);
                                }
                                break;
                            case "West":

                                if (((Integer.parseInt(tfXchair.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYchair.getText()) * 50 + 90) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "chair cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelchair.setBounds(
                                            Integer.parseInt(tfXchair.getText()) * 50,
                                            Integer.parseInt(tfYchair.getText()) * 50,
                                            90,
                                            90);
                                    labelchair.setIcon(Chair_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("chair has been printed");
                    labelchair.setHorizontalAlignment(JLabel.CENTER);
                    labelchair.setVerticalAlignment(JLabel.CENTER);
                    labelchair.setOpaque(true);
                    labelchair.setVisible(true);

                    if (!arr.furnitureOverlaps(labelchair, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelchair, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelchair);
                            }
                        }
                        System.out.println("labeltable is passed to  array and added to panel");
                    } else {
                        System.out.println("labeltable overlaps with existing furniture");
                    }
                    labelchair.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelchair;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelchair.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fchair.add(tfchair);
        fchair.add(cbroom);
        fchair.add(tfXchair);
        fchair.add(tfYchair);
        fchair.add(cbposition);
        fchair.add(submit);
        fchair.pack();
        fchair.setVisible(true);

        // Return the panel
        return labelchair;

    }

    public JLabel diningSet() {

        frame fdiningSet = new frame();
        fdiningSet.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fdiningSet.setSize(580, 400);
        fdiningSet.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfdiningSet = new JTextField("Enter the name of the dining set", 20);
        JTextField tfXdiningset = new JTextField("Enter the horizontal - position of the diningset", 20);
        JTextField tfYdiningset = new JTextField("Enter the vertical - position of the diningset", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labeldiningSet = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labeldiningSet.setName(name);
                    labeldiningSet.setText(name);
                    labeldiningSet.setHorizontalTextPosition(JLabel.CENTER);
                    labeldiningSet.setVerticalTextPosition(JLabel.CENTER);

                    arr.getRoompanel((String) cbroom.getSelectedItem());
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if (((Integer.parseInt(tfXdiningset.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYdiningset.getText()) * 50 + 62) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "diningset cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldiningSet.setBounds(Integer.parseInt(tfXdiningset.getText()) * 50,
                                            Integer.parseInt(tfYdiningset.getText()) * 50,
                                            100,
                                            62);
                                    labeldiningSet.setIcon(diningSet_north);

                                }

                                break;
                            case "South":

                                if (((Integer.parseInt(tfXdiningset.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYdiningset.getText()) * 50 + 62) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "diningset cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldiningSet.setBounds(Integer.parseInt(tfXdiningset.getText()) * 50,
                                            Integer.parseInt(tfXdiningset.getText()) * 50,
                                            100,
                                            62);
                                    labeldiningSet.setIcon(diningSet_south);
                                }
                                break;
                            case "East":

                                if (((Integer.parseInt(tfXdiningset.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYdiningset.getText()) * 50 + 62) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "diningset cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldiningSet.setBounds(
                                            Integer.parseInt(tfXdiningset.getText()) * 50,
                                            Integer.parseInt(tfYdiningset.getText()) * 50,
                                            62,
                                            100);
                                    labeldiningSet.setIcon(diningSet_east);
                                }
                                break;
                            case "West":

                                if (((Integer.parseInt(tfXdiningset.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth())
                                        || ((Integer.parseInt(tfYdiningset.getText()) * 50 + 62) > arr
                                                .getRoompanel((String) cbroom.getSelectedItem()).getHeight())) {
                                    JOptionPane.showMessageDialog(null, "diningset cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldiningSet.setBounds(
                                            Integer.parseInt(tfXdiningset.getText()) * 50,
                                            Integer.parseInt(tfYdiningset.getText()) * 50,
                                            62,
                                            100);
                                    labeldiningSet.setIcon(diningSet_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }

                    System.out.println("diningset has been printed");
                    labeldiningSet.setHorizontalAlignment(JLabel.CENTER);
                    labeldiningSet.setVerticalAlignment(JLabel.CENTER);
                    labeldiningSet.setOpaque(true);
                    labeldiningSet.setVisible(true);

                    if (!arr.furnitureOverlaps(labeldiningSet, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labeldiningSet, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labeldiningSet);
                            }
                        }
                        System.out.println("labeldiningset is passed to  array and added to panel");
                    } else {
                        System.out.println("labeldiningset overlaps with existing furniture");
                    }

                    labeldiningSet.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labeldiningSet;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labeldiningSet.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fdiningSet.add(tfdiningSet);
        fdiningSet.add(cbroom);
        fdiningSet.add(tfXdiningset);
        fdiningSet.add(tfYdiningset);
        fdiningSet.add(cbposition);
        fdiningSet.add(submit);
        fdiningSet.pack();
        fdiningSet.setVisible(true);

        // Return the panel
        return labeldiningSet;

    }

    public JLabel Commode() {

        frame fcommode = new frame();
        fcommode.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fcommode.setSize(580, 400);
        fcommode.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfcommode = new JTextField("Enter the name of the commode", 20);
        JTextField tfXcommode = new JTextField("Enter the position of the commode from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labelcommode = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelcommode.setName(name);
                    labelcommode.setHorizontalTextPosition(JLabel.CENTER);
                    labelcommode.setVerticalTextPosition(JLabel.CENTER);

                    arr.getRoompanel((String) cbroom.getSelectedItem());
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXcommode.getText()) * 50 + 75) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "commode cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelcommode.setBounds(Integer.parseInt(tfXcommode.getText()) * 50,
                                            0,
                                            75,
                                            75);
                                    labelcommode.setIcon(Commode_north);

                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXcommode.getText()) * 50 + 75) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "commode cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelcommode.setBounds(Integer.parseInt(tfXcommode.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 75),
                                            75,
                                            75);
                                    labelcommode.setIcon(Commode_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXcommode.getText()) * 50 + 75) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "commode cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelcommode.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 75),
                                            Integer.parseInt(tfXcommode.getText()) * 50,
                                            75,
                                            75);
                                    labelcommode.setIcon(Commode_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXcommode.getText()) * 50 + 75) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "commode cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelcommode.setBounds(0,
                                            Integer.parseInt(tfXcommode.getText()) * 50,
                                            75,
                                            75);
                                    labelcommode.setIcon(Commode_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("commode has been printed");

                    labelcommode.setHorizontalAlignment(JLabel.CENTER);
                    labelcommode.setVerticalAlignment(JLabel.CENTER);
                    labelcommode.setOpaque(true);
                    labelcommode.setVisible(true);
                    if (!arr.furnitureOverlaps(labelcommode, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelcommode, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelcommode);
                            }
                        }
                        System.out.println("labelcommode is passed to  array and added to panel");
                    } else {
                        System.out.println("labelcommode overlaps with existing furniture");
                    }

                    labelcommode.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelcommode;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelcommode.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fcommode.add(tfcommode);
        fcommode.add(cbroom);
        fcommode.add(tfXcommode);
        fcommode.add(cbposition);
        fcommode.add(submit);
        fcommode.pack();
        fcommode.setVisible(true);

        // Return the panel
        return labelcommode;

    }

    public JLabel Sink() {

        frame fsink = new frame();
        fsink.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fsink.setSize(580, 400);
        fsink.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfsink = new JTextField("Enter the name of the sink", 20);
        JTextField tfXsink = new JTextField("Enter the position of the sink from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labelsink = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelsink.setName(name);
                    labelsink.setHorizontalTextPosition(JLabel.CENTER);
                    labelsink.setVerticalTextPosition(JLabel.CENTER);

                    arr.getRoompanel((String) cbroom.getSelectedItem());
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXsink.getText()) * 50 + 80) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "sink cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsink.setBounds(Integer.parseInt(tfXsink.getText()) * 50,
                                            0,
                                            80,
                                            60);
                                    labelsink.setIcon(Sink_north);

                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXsink.getText()) * 50 + 80) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "sink cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsink.setBounds(Integer.parseInt(tfXsink.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 60),
                                            80,
                                            60);
                                    labelsink.setIcon(Sink_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXsink.getText()) * 50 + 80) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "sink cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsink.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 60),
                                            Integer.parseInt(tfXsink.getText()) * 50,
                                            60,
                                            80);
                                    labelsink.setIcon(Sink_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXsink.getText()) * 50 + 80) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "sink cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelsink.setBounds(0,
                                            Integer.parseInt(tfXsink.getText()) * 50,
                                            60,
                                            80);
                                    labelsink.setIcon(Sink_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("sink has been printed");
                    labelsink.setHorizontalAlignment(JLabel.CENTER);
                    labelsink.setVerticalAlignment(JLabel.CENTER);
                    labelsink.setOpaque(true);
                    labelsink.setVisible(true);

                    if (!arr.furnitureOverlaps(labelsink, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelsink, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelsink);
                            }
                        }
                        System.out.println("labelsink is passed to  array and added to panel");
                    } else {
                        System.out.println("labelsink overlaps with existing furniture");
                    }

                    labelsink.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelsink;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelsink.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fsink.add(tfsink);
        fsink.add(cbroom);
        fsink.add(tfXsink);
        fsink.add(cbposition);
        fsink.add(submit);
        fsink.pack();
        fsink.setVisible(true);

        // Return the panel
        return labelsink;

    }

    public JLabel Shower() {

        frame fshower = new frame();
        fshower.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fshower.setSize(580, 400);
        fshower.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfshower = new JTextField("Enter the name of the shower", 20);
        JTextField tfXshower = new JTextField("Enter the position of the shower from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labelshower = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == submit) {

                    labelshower.setName(name);
                    labelshower.setHorizontalTextPosition(JLabel.CENTER);
                    labelshower.setVerticalTextPosition(JLabel.CENTER);
                    arr.getRoompanel((String) cbroom.getSelectedItem());

                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXshower.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "shower cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelshower.setBounds(Integer.parseInt(tfXshower.getText()) * 50,
                                            0,
                                            100,
                                            59);
                                    labelshower.setIcon(Shower_north);

                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXshower.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "shower cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelshower.setBounds(Integer.parseInt(tfXshower.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 59),
                                            100,
                                            59);
                                    labelshower.setIcon(Shower_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXshower.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "shower cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelshower.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 59),
                                            Integer.parseInt(tfXshower.getText()) * 50,
                                            59,
                                            100);
                                    labelshower.setIcon(Shower_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXshower.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "shower cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelshower.setBounds(0,
                                            Integer.parseInt(tfXshower.getText()) * 50,
                                            59,
                                            100);
                                    labelshower.setIcon(Shower_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("shower has been printed");

                    labelshower.setHorizontalAlignment(JLabel.CENTER);
                    labelshower.setVerticalAlignment(JLabel.CENTER);
                    labelshower.setOpaque(true);
                    labelshower.setVisible(true);
                    if (!arr.furnitureOverlaps(labelshower, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelshower, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelshower);
                            }
                        }
                        System.out.println("labelshower is passed to  array and added to panel");
                    } else {
                        System.out.println("labelshower overlaps with existing furniture");
                    }

                    labelshower.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelshower;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelshower.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fshower.add(tfshower);
        fshower.add(cbroom);
        fshower.add(tfXshower);
        fshower.add(cbposition);
        fshower.add(submit);
        fshower.pack();
        fshower.setVisible(true);

        // Return the panel
        return labelshower;

    }

    public JLabel stove() {

        frame fstove = new frame();
        fstove.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fstove.setSize(580, 400);
        fstove.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfstove = new JTextField("Enter the name of the stove", 20);
        JTextField tfXstove = new JTextField("Enter the position of the stove from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labelstove = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelstove.setName(name);
                    labelstove.setHorizontalTextPosition(JLabel.CENTER);
                    labelstove.setVerticalTextPosition(JLabel.CENTER);

                    arr.getRoompanel((String) cbroom.getSelectedItem());
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXstove.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "stove cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelstove.setBounds(Integer.parseInt(tfXstove.getText()) * 50,
                                            0,
                                            90,
                                            90);
                                    labelstove.setIcon(stove_north);
                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXstove.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "stove cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelstove.setBounds(Integer.parseInt(tfXstove.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 90),
                                            90,
                                            90);
                                    labelstove.setIcon(stove_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXstove.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "stove cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelstove.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 90),
                                            Integer.parseInt(tfXstove.getText()) * 50,
                                            90,
                                            90);
                                    labelstove.setIcon(stove_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXstove.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "stove cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelstove.setBounds(0,
                                            Integer.parseInt(tfXstove.getText()) * 50,
                                            90,
                                            90);
                                    labelstove.setIcon(stove_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("stove has been printed");

                    labelstove.setHorizontalAlignment(JLabel.CENTER);
                    labelstove.setVerticalAlignment(JLabel.CENTER);
                    labelstove.setOpaque(true);
                    labelstove.setVisible(true);
                    if (!arr.furnitureOverlaps(labelstove, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelstove, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelstove);
                            }
                        }
                        System.out.println("labelstove is passed to  array and added to panel");
                    } else {
                        System.out.println("labelstove overlaps with existing furniture");
                    }

                    labelstove.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelstove;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelstove.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fstove.add(tfstove);
        fstove.add(cbroom);
        fstove.add(tfXstove);
        fstove.add(cbposition);
        fstove.add(submit);
        fstove.pack();
        fstove.setVisible(true);

        // Return the panel
        return labelstove;

    }

    public JLabel Washbasin() {

        frame fwashbasin = new frame();
        fwashbasin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fwashbasin.setSize(580, 400);
        fwashbasin.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfwashbasin = new JTextField("Enter the name of the washbasin", 20);
        JTextField tfXwashbasin = new JTextField("Enter the position of the washbasin from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labelwashbasin = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == submit) {

                    labelwashbasin.setName(name);
                    labelwashbasin.setHorizontalTextPosition(JLabel.CENTER);
                    labelwashbasin.setVerticalTextPosition(JLabel.CENTER);

                    arr.getRoompanel((String) cbroom.getSelectedItem());
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXwashbasin.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "washbasin cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwashbasin.setBounds(Integer.parseInt(tfXwashbasin.getText()) * 50,
                                            0,
                                            90,
                                            63);
                                    labelwashbasin.setIcon(Washbasin_north);

                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXwashbasin.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "washbasin cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwashbasin.setBounds(Integer.parseInt(tfXwashbasin.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 63),
                                            90,
                                            63);
                                    labelwashbasin.setIcon(Washbasin_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXwashbasin.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "washbasin cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwashbasin.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 63),
                                            Integer.parseInt(tfXwashbasin.getText()) * 50,
                                            63,
                                            90);
                                    labelwashbasin.setIcon(Washbasin_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXwashbasin.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "washbasin cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwashbasin.setBounds(0,
                                            Integer.parseInt(tfXwashbasin.getText()) * 50,
                                            63,
                                            90);
                                    labelwashbasin.setIcon(Washbasin_west);
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("washbasin has been printed");

                    labelwashbasin.setHorizontalAlignment(JLabel.CENTER);
                    labelwashbasin.setVerticalAlignment(JLabel.CENTER);
                    labelwashbasin.setOpaque(true);
                    labelwashbasin.setVisible(true);
                    if (!arr.furnitureOverlaps(labelwashbasin, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelwashbasin, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelwashbasin);
                            }
                        }
                        System.out.println("labelwashbasin is passed to  array and added to panel");
                    } else {
                        System.out.println("labelwashbasin overlaps with existing furniture");
                    }

                    labelwashbasin.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelwashbasin;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelwashbasin.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        fwashbasin.add(tfwashbasin);
        fwashbasin.add(cbroom);
        fwashbasin.add(tfXwashbasin);
        fwashbasin.add(cbposition);
        fwashbasin.add(submit);
        fwashbasin.pack();
        fwashbasin.setVisible(true);

        // Return the panel
        return labelwashbasin;

    }

    public JLabel Door() {

        frame fdoor = new frame();
        fdoor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fdoor.setSize(580, 400);
        fdoor.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfdoor = new JTextField("Enter the name of the door", 20);
        JTextField tfXdoor = new JTextField("Enter the position of the door from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) tfdoor.getText();

        JLabel labeldoor = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labeldoor.setName(name);
                    labeldoor.setHorizontalTextPosition(JLabel.CENTER);
                    labeldoor.setVerticalTextPosition(JLabel.CENTER);
                    // int x = Integer.parseInt(tfXdoor.getText());

                    // boolean isOnEdge = false;
                    arr.getRoompanel((String) cbroom.getSelectedItem());

                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXdoor.getText()) * 50 + 108) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "door cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldoor.setBounds(Integer.parseInt(tfXdoor.getText()) * 50,
                                            0,
                                            108,
                                            15);
                                    labeldoor.setIcon(Door_north);

                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXdoor.getText()) * 50 + 108) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "door cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldoor.setBounds(Integer.parseInt(tfXdoor.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 15),
                                            108,
                                            15);
                                    labeldoor.setIcon(Door_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXdoor.getText()) * 50 + 108) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "door cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldoor.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 15),
                                            Integer.parseInt(tfXdoor.getText()) * 50,
                                            15,
                                            108);
                                    labeldoor.setIcon(Door_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXdoor.getText()) * 50 + 108) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "door cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labeldoor.setBounds(0,
                                            Integer.parseInt(tfXdoor.getText()) * 50,
                                            15,
                                            108);
                                    labeldoor.setIcon(Door_west);
                                }
                                break;
                        }

                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("door has been printed");
                    labeldoor.setHorizontalAlignment(JLabel.CENTER);
                    labeldoor.setVerticalAlignment(JLabel.CENTER);
                    labeldoor.setOpaque(true);
                    labeldoor.setVisible(true);
                    if (!arr.doorOverlap(labeldoor, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labeldoor, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        arr.setdoor(labeldoor, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labeldoor);
                            }
                        }
                        System.out.println("labeldoor is passed to  array and added to panel");
                    } else {
                        System.out.println("labeldoor overlaps with existing furniture");
                    }

                }

            }
        });

        fdoor.add(tfdoor);
        fdoor.add(cbroom);
        fdoor.add(tfXdoor);
        fdoor.add(cbposition);
        fdoor.add(submit);
        fdoor.pack();
        fdoor.setVisible(true);

        // Return the panel
        return labeldoor;

    }

    public JLabel Window() {

        frame fwindow = new frame();
        fwindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fwindow.setSize(580, 400);
        fwindow.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tfwindow = new JTextField("Enter the name of the window", 20);
        JTextField tfXwindow = new JTextField("Enter the position of the window from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) tfwindow.getText();

        JLabel labelwindow = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelwindow.setName(name);
                    labelwindow.setHorizontalTextPosition(JLabel.CENTER);
                    labelwindow.setVerticalTextPosition(JLabel.CENTER);

                    arr.getRoompanel((String) cbroom.getSelectedItem());
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXwindow.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "window cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwindow.setBounds(Integer.parseInt(tfXwindow.getText()) * 50,
                                            0,
                                            100,
                                            21);
                                    labelwindow.setIcon(Window_north);

                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXwindow.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "window cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwindow.setBounds(Integer.parseInt(tfXwindow.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 21),
                                            100,
                                            21);
                                    labelwindow.setIcon(Window_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXwindow.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "window cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwindow.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 21),
                                            Integer.parseInt(tfXwindow.getText()) * 50,
                                            21,
                                            100);
                                    labelwindow.setIcon(Window_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXwindow.getText()) * 50 + 100) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "window cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelwindow.setBounds(0,
                                            Integer.parseInt(tfXwindow.getText()) * 50,
                                            21,
                                            100);
                                    labelwindow.setIcon(Window_west);
                                }
                                break;
                        }

                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("window has been printed");
                    // labelwindow.setIcon(Window);
                    labelwindow.setHorizontalAlignment(JLabel.CENTER);
                    labelwindow.setVerticalAlignment(JLabel.CENTER);
                    labelwindow.setOpaque(true);
                    labelwindow.setVisible(true);
                    if (!arr.furnitureOverlaps(labelwindow, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelwindow, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelwindow);
                            }
                        }
                        System.out.println("labelwindow is passed to  array and added to panel");
                    } else {
                        System.out.println("labelwindow overlaps with existing furniture");
                    }
                }

            }
        });

        fwindow.add(tfwindow);
        fwindow.add(cbroom);
        fwindow.add(tfXwindow);
        fwindow.add(cbposition);
        fwindow.add(submit);
        fwindow.pack();
        fwindow.setVisible(true);

        // Return the panel
        return labelwindow;

    }

    public JLabel Fridge() {

        frame ffridge = new frame();
        ffridge.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ffridge.setSize(580, 400);
        ffridge.setLayout(new FlowLayout());

        int i = arr.roomsave.size();
        String[] roomnames = new String[i];
        roomnames = arr.getroomnames();
        JComboBox<String> cbroom;
        cbroom = new JComboBox<>(roomnames);

        JButton submit = new JButton("SUBMIT");
        JTextField tffridge = new JTextField("Enter the name of the fridge", 20);
        JTextField tfXfridge = new JTextField("Enter the position of the fridge from the wall", 20);
        String[] position = { "North", "South", "East", "West" };
        JComboBox<String> cbposition = new JComboBox<>(position);

        String name = (String) cbroom.getSelectedItem();

        JLabel labelfridge = new JLabel();

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {

                    labelfridge.setName(name);
                    labelfridge.setHorizontalTextPosition(JLabel.CENTER);
                    labelfridge.setVerticalTextPosition(JLabel.CENTER);

                    arr.getRoompanel((String) cbroom.getSelectedItem());
                    try {
                        switch ((String) cbposition.getSelectedItem()) {
                            case "North":

                                if ((Integer.parseInt(tfXfridge.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "fridge cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelfridge.setBounds(Integer.parseInt(tfXfridge.getText()) * 50,
                                            0,
                                            90,
                                            97);
                                    labelfridge.setIcon(Fridge_north);

                                }

                                break;
                            case "South":

                                if ((Integer.parseInt(tfXfridge.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getWidth()) {
                                    JOptionPane.showMessageDialog(null, "fridge cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelfridge.setBounds(Integer.parseInt(tfXfridge.getText()) * 50,
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getHeight() - 97),
                                            90,
                                            97);
                                    labelfridge.setIcon(Fridge_south);
                                }
                                break;
                            case "East":

                                if ((Integer.parseInt(tfXfridge.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "fridge cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelfridge.setBounds(
                                            (arr.getRoompanel((String) cbroom.getSelectedItem()).getWidth() - 97),
                                            Integer.parseInt(tfXfridge.getText()) * 50,
                                            97,
                                            90);
                                    labelfridge.setIcon(Fridge_east);
                                }
                                break;
                            case "West":

                                if ((Integer.parseInt(tfXfridge.getText()) * 50 + 90) > arr
                                        .getRoompanel((String) cbroom.getSelectedItem()).getHeight()) {
                                    JOptionPane.showMessageDialog(null, "fridge cant be added", "Error",
                                            JOptionPane.ERROR_MESSAGE);

                                } else {
                                    labelfridge.setBounds(0,
                                            Integer.parseInt(tfXfridge.getText()) * 50,
                                            97,
                                            90);
                                    labelfridge.setIcon(Fridge_west);
                                }
                                break;
                        }

                    } catch (NumberFormatException ex) {
                        int input = JOptionPane.showOptionDialog(null,
                                "please enter a number in the number box", "error", JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
                            // fbed.dispose();
                        }
                    }
                    System.out.println("fridge has been printed");

                    labelfridge.setHorizontalAlignment(JLabel.CENTER);
                    labelfridge.setVerticalAlignment(JLabel.CENTER);
                    labelfridge.setOpaque(true);
                    labelfridge.setVisible(true);
                    if (!arr.furnitureOverlaps(labelfridge, (String) cbroom.getSelectedItem())) {

                        arr.setfurniture(labelfridge, (String) cbroom.getSelectedItem(),
                                arr.getroomtype((String) cbroom.getSelectedItem()));
                        for (roomsave newpanel : arr.roomsave) {
                            if (newpanel.getname() == (String) cbroom.getSelectedItem()) {
                                // newpanel.add(label);
                                newpanel.updatepanel(labelfridge);
                            }
                        }
                        System.out.println("labelfridge is passed to  array and added to panel");
                    } else {
                        System.out.println("labelfridge overlaps with existing furniture");
                    }

                    labelfridge.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            selectedRoom = labelfridge;
                            initialClick = e.getPoint();
                            PrevCoord = ((JLabel) e.getSource()).getLocation();

                        }

                    });
                    labelfridge.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {
                            moveRoom(e, (String) cbroom.getSelectedItem());
                        }
                    });
                }

            }
        });

        ffridge.add(tffridge);
        ffridge.add(cbroom);
        ffridge.add(tfXfridge);
        ffridge.add(cbposition);
        ffridge.add(submit);
        ffridge.pack();
        ffridge.setVisible(true);

        // Return the panel
        return labelfridge;

    }

    private void moveRoom(MouseEvent e, String roomname) {
        if (selectedRoom != null) {
            // Temporarily set floor layout to null for free dragging

            // Calculate the new location
            int thisX = selectedRoom.getX();
            int thisY = selectedRoom.getY();

            // Get the offset based on initial click
            int xMoved = e.getX() - initialClick.x;
            int yMoved = e.getY() - initialClick.y;

            // Move the room to the new location
            int newX = thisX + xMoved;
            int newY = thisY + yMoved;
            if (!arr.furnitureOverlapsml(selectedRoom, newX, newY, roomname)) {
                // selectedRoom.setLocation(newX, newY);
            }
            ;

            // Refresh the container to show the updated location

        }
    }

}