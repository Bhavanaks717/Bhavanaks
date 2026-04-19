package lab5;

import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {

    JFrame f;

    TabbedPaneExample() {

        f = new JFrame("TabbedPane Example");

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();

        tp.add("BLUE", p1);
        tp.add("RED", p2);
        tp.add("GREEN", p3);

        // Add to frame
        f.add(tp);

        // Frame settings
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}