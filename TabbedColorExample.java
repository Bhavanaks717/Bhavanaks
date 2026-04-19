package lab5;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedColorExample {

    JFrame f;
    JTabbedPane tp;

    TabbedColorExample() {

        f = new JFrame("Tabbed Pane Example");

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Create tabbed pane
        tp = new JTabbedPane();

        tp.addTab("CYAN", p1);
        tp.addTab("MAGENTA", p2);
        tp.addTab("YELLOW", p3);

        // Add ChangeListener to detect tab change
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();

                if (index == 0) {
                    System.out.println("Cyan color is selected");
                } else if (index == 1) {
                    System.out.println("Magenta color is selected");
                } else if (index == 2) {
                    System.out.println("Yellow color is selected");
                }
            }
        });

        // Add to frame
        f.add(tp);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedColorExample();
    }
}