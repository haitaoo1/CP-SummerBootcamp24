package Chapter4;

import java.util.Scanner;

public class ProblemD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); 
        
        char[][] table = new char[N][M];
        for (int i = 0; i < N; i++) {
            table[i] = scanner.nextLine().toCharArray();
        }
        
        boolean[] fillRows = new boolean[N];
        boolean[] fillCols = new boolean[M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (table[i][j] == '#') {
                    fillRows[i] = true;
                    fillCols[j] = true;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (fillRows[i] || fillCols[j]) {
                    table[i][j] = '#';
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
}
