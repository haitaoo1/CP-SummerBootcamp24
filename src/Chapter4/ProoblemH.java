package Chapter4;

import java.util.Scanner;

public class ProoblemH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        int maxFil = 0, maxCol = 0;

        int[][] campo = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                campo[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
 
        for (int i = 0; i < N; i++) {
            int sumFil = 0;;
            for (int j = 0; j < M; j++) {
               sumFil += campo[i][j];
            }
            maxFil = Math.max(maxFil, sumFil);

        }

        for (int i = 0; i < M; i++) {
            int sumCol = 0;;
            for (int j = 0; j < N ; j++) {
               sumCol += campo[j][i];
            }
            maxCol = Math.max(maxCol, sumCol);
        }

        System.out.println(Math.max(maxFil, maxCol));
        scanner.close();
    }
}
