package Lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;


public class ShapesWithButton {
    static Shape randomizer() {
        Random rand = new Random();
        int shapeNumber = rand.nextInt(2);
        if (shapeNumber == 1) {
            return new Rectangle(rand.nextInt(1200), rand.nextInt(550), rand.nextInt(100), rand.nextInt(100));
        } else {
            int radius = rand.nextInt(150);
            return new Ellipse2D.Double(rand.nextInt(1200), rand.nextInt(550), radius, radius);
        }
    }

    static class Component extends JComponent {
        ArrayList<Shape> shapes = new ArrayList<>();

        Component(Graphics g) {
            for (int i = 0; i < 20; i++) {
                shapes.add(ShapesWithButton.randomizer());
            }
            this.paintComponent(g);
        }
        @Override
        protected void paintComponent(Graphics g) {
            Random rand = new Random();
            Graphics2D g2 = (Graphics2D) g;

            for (int i = 0; i < 20; i++) {
                g2.fill(randomizer());
                float red = rand.nextFloat();
                float green = rand.nextFloat();
                float blue = rand.nextFloat();
                Color randomColor = new Color(red, green, blue);
                g2.setColor(randomColor);
            }

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
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Генерация фигур");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                jPanel.add(new Component(jPanel.getGraphics()));
                jButton.setLabel(" Я хочу больше фигур ");
            }
        });

        jPanel.add(jButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}