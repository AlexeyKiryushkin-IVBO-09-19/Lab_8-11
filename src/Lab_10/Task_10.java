package Lab_10;

import java.util.Scanner;

public class Task_10 {

    public static int numberReverser(int number, int buffer) {
        if (number == 0) return buffer;
        else return numberReverser( number/10, buffer*10 + number%10 );
    }
    public static void main(String[ ] args) {
        Scanner n = new Scanner(System.in);
        int result = numberReverser(n.nextInt(), 0);
        System.out.println(result);
    }
}
