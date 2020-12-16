package Lab_8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gif extends JPanel {
    static int x;
    int y;

    public void paintComponent(Graphics g) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first.png");
        list.add("second.png");
        list.add("third.png");
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (int i = 0; i < 3; i++) {
            String s = list.get(i);
            Image image = new ImageIcon(s).getImage();
            g.drawImage(image, x, y, Color.white, null);
            x = x + 50;
            y = 0;

            repaint();

            try {
                Thread.sleep(20);
            } catch (Exception exception) {
            }
        }
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Gif one =new Gif();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(one);
        frame.setSize(1600, 900);
        frame.setVisible(true);
    }
}
