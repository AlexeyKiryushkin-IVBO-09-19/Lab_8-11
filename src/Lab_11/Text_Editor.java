package Lab_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text_Editor {

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(250, 150, 800, 450);
        return jFrame;
    }

    public static void main(String[] args) {

        JMenuItem[] menuOfColors = new JMenuItem[] {new JMenuItem("Синий"), new JMenuItem("Красный"), new JMenuItem("Чёрный")};
        JMenuItem[] menuOfFonts = new JMenuItem[] {new JMenuItem("Times New Roman"), new JMenuItem("MS Sans Serif"), new JMenuItem("Courier New")};

        JFrame jFrame = getFrame();

        JTextArea jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jFrame.add(jTextArea);

        JMenu colors = new JMenu("Цвета");
        JMenu fonts = new JMenu("Шрифты");

        for (JMenuItem item : menuOfColors) {
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    switch (item.getText()) {
                        case ("Синий") -> jTextArea.setForeground(Color.BLUE);
                        case ("Красный") -> jTextArea.setForeground(Color.RED);
                        case ("Чёрный") -> jTextArea.setForeground(Color.BLACK);
                    }
                }
            });
            colors.add(item);
        }

        for (JMenuItem item : menuOfFonts) {
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    switch (item.getText()) {
                        case ("Times New Roman") -> jTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                        case ("MS Sans Serif") -> jTextArea.setFont(Font.getFont(Font.SANS_SERIF));
                        case ("Courier New") -> jTextArea.setFont(new Font("Courier New", Font.PLAIN, 14));
                    }
                }
            });
            fonts.add(item);
        }

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(colors);
        menuBar.add(fonts);
        jFrame.setJMenuBar(menuBar);

        jFrame.setVisible(true);
    }
}
