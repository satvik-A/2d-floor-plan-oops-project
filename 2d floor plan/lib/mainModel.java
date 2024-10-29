
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

        JPanel panelSIDE = new JPanel();
        panelSIDE.setBackground(Color.YELLOW);
        panelSIDE.setPreferredSize(new Dimension(100, 100));
        m.f.add(panelSIDE, BorderLayout.CENTER);

        JPanel paneltop = new JPanel();
        paneltop.setBackground(Color.BLACK);
        paneltop.setPreferredSize(new Dimension(100, 100));
        m.f.add(paneltop, BorderLayout.CENTER);

        JPanel panelRight = new JPanel();
        panelRight.setBackground(Color.BLUE);
        panelRight.setPreferredSize(new Dimension(100, 100));
        m.f.add(panelRight, BorderLayout.CENTER);

    }

}
