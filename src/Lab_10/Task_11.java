package Lab_10;

import java.util.Scanner;

public class Task_11 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int previousDigit = scan.nextInt();
        int currentDigit = scan.nextInt();
        int counter = 0;

        while (previousDigit != currentDigit || previousDigit != 0) {
            while (previousDigit != 0) {
                if (previousDigit % 10 == 1) counter++;
                previousDigit /= 10;
            }
            previousDigit = currentDigit;
            currentDigit = scan.nextInt();
        }

            System.out.println("I've found " + counter + " ones in the sequence");
    }
}
