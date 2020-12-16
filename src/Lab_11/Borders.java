package Lab_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Borders {

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(50, 30, 400, 225);
        return jFrame;
    }

    static class Area {
        Area (JFrame jFrame, String name, JButton jButton, String borderLayout) {
            jButton.addMouseListener (new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent event) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в " + name);
                }
            });
            jFrame.add(jButton, borderLayout);
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        Area[] areas = new Area[]{
                new Area (jFrame, "САО", new JButton("NORTH"), BorderLayout.NORTH),
                new Area (jFrame, "СВАО", new JButton("EAST"), BorderLayout.EAST),
                new Area (jFrame, "ЮЗАО", new JButton("SOUTH"), BorderLayout.SOUTH),
                new Area (jFrame, "ЗАО", new JButton("WEST"), BorderLayout.WEST),
                new Area (jFrame, "ЦАО", new JButton("CENTER"), BorderLayout.CENTER)
        };
        jFrame.setVisible(true);
    }
}
