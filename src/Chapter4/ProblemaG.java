package Chapter4;

import java.util.Scanner;

public class ProblemaG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <casos; i++) {
            char[][] tablero = new char[8][8];
            for (int j = 0; j < 8; j++) {
                tablero[j] = scanner.nextLine().toCharArray();
            }
            
            for (int j = 0; j < 8; j++) {
                for (int j2 = 0; j2 < 8; j2++) {
                    char correcto = (j + j2) % 2 == 0 ? 'W' : 'B';

                    if(!(correcto == tablero[j][j2])){
                        tablero[j][j2] = 'X';
                    }

                }
            }
           for (int j = 0; j < 8 ; j++) {
                System.out.println(tablero[j]);
           }

        }

        scanner.close();
    }
}
