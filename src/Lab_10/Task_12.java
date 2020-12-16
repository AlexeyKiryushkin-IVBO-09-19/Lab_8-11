package Lab_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_12 {

    public static void main (String[] args) {
        Application();
    }

    static void Application () {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        ArrayList<Integer> answers = new ArrayList<>();

        while (number != 0) {
                if (number % 2 == 1) answers.add(number);
                number = scan.nextInt();
        }
        for(int i : answers) {
            System.out.print(i + "   ");
        }
    }
}
