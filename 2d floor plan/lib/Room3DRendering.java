import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Room3DRendering extends JFrame {
    private JTextField lengthField;
    private JTextField widthField;
    private JTextField heightField;
    private DrawingPanel drawingPanel;

    public Room3DRendering() {
        setTitle("3D Room Rendering (Isometric View)");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        inputPanel.add(new JLabel("Length: "));
        lengthField = new JTextField();
        inputPanel.add(lengthField);
        setVisible(true);

        inputPanel.add(new JLabel("Width: "));
        widthField = new JTextField();
        inputPanel.add(widthField);
        setVisible(true);

        inputPanel.add(new JLabel("Height: "));
        heightField = new JTextField();
        inputPanel.add(heightField);
        setVisible(true);

        JButton renderButton = new JButton("Render Room");
        inputPanel.add(renderButton);

        renderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.repaint();
            }
        });

        add(inputPanel, BorderLayout.NORTH);

        // Drawing panel for the room
        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);
    }

    // Panel to draw the room in isometric view
    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Get dimensions from user input
            int length = Integer.parseInt(lengthField.getText());
            int width = Integer.parseInt(widthField.getText());
            int height = Integer.parseInt(heightField.getText());

            // Define basic isometric angles
            int originX = 300;
            int originY = 400;

            // Draw the room using isometric projection
            // Isometric projection simplifies the representation in 2D
            int[] xPoints = {
                    originX,
                    originX + (int) (length * 0.5),
                    originX + (int) (length * 0.5) - (int) (width * 0.5),
                    originX - (int) (width * 0.5)
            };

            int[] yPoints = {
                    originY,
                    originY - (int) (length * 0.25),
                    originY - (int) (length * 0.25) - (int) (width * 0.25),
                    originY - (int) (width * 0.25)
            };

            // Draw floor
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.fillPolygon(xPoints, yPoints, 4);

            // Draw walls
            g2d.setColor(Color.GRAY);
            g2d.drawLine(xPoints[0], yPoints[0], xPoints[3], yPoints[3]); // Left wall
            g2d.drawLine(xPoints[0], yPoints[0], xPoints[1], yPoints[1]); // Right wall

            // Height projection (walls)
            int[] heightXPoints = { xPoints[0], xPoints[3], xPoints[2], xPoints[1] };
            int[] heightYPoints = {
                    yPoints[0],
                    yPoints[0] - height,
                    yPoints[0] - height - (int) (width * 0.25),
                    yPoints[0] - height - (int) (length * 0.25)
            };

            // Draw height lines
            g2d.setColor(Color.DARK_GRAY);
            for (int i = 0; i < 4; i++) {
                g2d.drawLine(xPoints[i], yPoints[i], heightXPoints[i], heightYPoints[i]);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Room3DRendering frame = new Room3DRendering();
            frame.setVisible(true);
        });
    }
}