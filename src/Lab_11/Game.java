package Lab_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game {
    static int number = new Random().nextInt(20);
    static int triesCounter = 0;

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(250, 150, 800, 450);
        return jFrame;
    }

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Проверить");
        Label label = new Label("Угадайте число от 0 до 20");
        TextField textField = new TextField(2);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (triesCounter == 2) {
                    int input = Integer.parseInt(textField.getText());
                    triesCounter++;
                    if (input == number) {
                        JOptionPane.showMessageDialog(jPanel, "Вы угадали!");
                    } else {
                        JOptionPane.showMessageDialog(jPanel, "Неверно, загадано было число " + number);
                    }
                    System.exit(0);
                } else {
                    int input = Integer.parseInt(textField.getText());
                    triesCounter++;
                    if (input == number) {
                        JOptionPane.showMessageDialog(jPanel, "Вы угадали!");
                        System.exit(0);
                    } else if (input < number) {
                        JOptionPane.showMessageDialog(jPanel, "Загаданное число больше");
                    } else {
                        JOptionPane.showMessageDialog(jPanel, "Загаданное число меньше");
                    }
                    switch (triesCounter) {
                        case 1 -> JOptionPane.showMessageDialog(jPanel, "Осталось две попытки");
                        case 2 -> JOptionPane.showMessageDialog(jPanel, "Осталась одна попытка");
                    }
                }

            }
        });

        jPanel.add(label);
        jPanel.add(textField);
        jPanel.add(jButton);
        jFrame.add(jPanel);
    }

}