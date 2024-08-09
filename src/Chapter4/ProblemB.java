package Chapter4;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] totalVentas = new int[N];

        for (int i = 0; i < N; i++) {
            totalVentas[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            totalVentas[i] += scanner.nextInt();
        }

        for (int ventas : totalVentas) {
            System.out.print(ventas + " ");
        }
        scanner.close();
    }
}
