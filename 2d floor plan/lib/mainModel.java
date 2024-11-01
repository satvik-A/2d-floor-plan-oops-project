
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

class mainModel {

    frame f;

    public static void main(String[] args) {
        mainModel m = new mainModel();
        m.f = new frame();
        m.f.setLayout(new BorderLayout());

        // SIDE PANNEL / SIDEBAR
        JPanel panelSIDE = new JPanel();
        panelSIDE.setBackground(Color.YELLOW);
        panelSIDE.setPreferredSize(new Dimension(150, 980));
        panelSIDE.setLayout(new BorderLayout());
        m.f.add(panelSIDE, BorderLayout.WEST);

        // INSTRUMENT PANNEL / TOPBAR /
        JPanel paneltop = new JPanel();
        paneltop.setBackground(Color.BLACK);
        paneltop.setPreferredSize(new Dimension(100, 100));
        m.f.add(paneltop, BorderLayout.NORTH);

        // DRAWING BORD /
        JPanel panelDB = new JPanel();
        panelDB.setBackground(Color.BLUE);
        panelDB.setPreferredSize(new Dimension(100, 100));
        m.f.add(panelDB, BorderLayout.CENTER);

        //
        JPanel panelSIDE1 = new JPanel();
        panelSIDE1.setBackground(Color.RED);
        panelSIDE1.setPreferredSize(new Dimension(150, 100));
        panelSIDE.add(panelSIDE1, BorderLayout.NORTH);
        //

        //
        JPanel panelSIDE4 = new JPanel();
        panelSIDE4.setBackground(Color.RED);
        panelSIDE4.setPreferredSize(new Dimension(150, 100));
        panelSIDE.add(panelSIDE4, BorderLayout.SOUTH);
        //

        // inside action listener for side panal object creator like creation of new
        // rooms

        JPanel panelSIDE2 = new JPanel();
        panelSIDE2.setBackground(Color.CYAN);
        panelSIDE2.setPreferredSize(new Dimension(150, 100));
        panelSIDE2.setLayout(new BorderLayout());
        panelSIDE.add(panelSIDE2, BorderLayout.CENTER);

        JPanel panelSIDE3 = new JPanel();
        panelSIDE3.setBackground(Color.DARK_GRAY);
        panelSIDE3.setPreferredSize(new Dimension(150, 100));
        panelSIDE2.add(panelSIDE3, BorderLayout.NORTH);

    }

}
