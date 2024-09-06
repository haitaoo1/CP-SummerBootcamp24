package Chapter6;

import java.util.Scanner;

public class ProblemaE {
    static int n;
    static char[][] lago;
    static boolean[][] visitado;

    // Movimientos posibles (arriba, abajo, izquierda, derecha)
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        sc.nextLine(); 

        // Leer la representación del lago
        lago = new char[n][n];
        visitado = new boolean[n][n];
        int rx = -1, ry = -1;  
        int cx = -1, cy = -1;  
        
        for (int i = 0; i < n; i++) {
            String linea = sc.nextLine();
            lago[i] = linea.toCharArray();
            // Encontrar las posiciones de 'R' y 'C'
            for (int j = 0; j < n; j++) {
                if (lago[i][j] == 'R') {
                    rx = i;
                    ry = j;
                } else if (lago[i][j] == 'C') {
                    cx = i;
                    cy = j;
                }
            }
        }

        // Resolver el problema usando la búsqueda recursiva
        int resultado = buscarCamino(rx, ry, cx, cy);

        System.out.println(resultado);

        sc.close();
    }
    private static int buscarCamino(int rx, int ry, int cx, int cy) {
        return 0;
    }
}
