package Lab_8;

import javax.swing.*;
import java.awt.*;

public class Picture {
    static class Component extends JComponent {
        private String path;

        Component (String path)
        {
            this.path = path;
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Image image = new ImageIcon(path).getImage();
            g2.drawImage(image, 0, 0, null);
        }

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(0, 0, 1600, 900);

        return jFrame;
    }

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new Component (args[0]));

    }

}
