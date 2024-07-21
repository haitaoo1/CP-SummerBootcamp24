package semana1;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String text = scanner.nextLine();
        String last = scanner.next();

        String[] divide = input.split(" ", 2);
        double number = Double.parseDouble(divide[0]);
        String redondear = String.format("%.3f", number);

        System.out.println(text + ": " + redondear);
        System.out.println(last);

        scanner.close();
    }
}
