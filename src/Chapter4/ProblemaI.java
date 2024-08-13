package Chapter4;

import java.util.Scanner;

public class ProblemaI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        boolean original = true;

        char [][] pintura = new char[N][M];

        for (int i = 0; i < N; i++) {
            pintura[i]  = scanner.nextLine().toCharArray();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M - 1; j++) {
                if(pintura[i][j] == pintura[i][j+1] &&  pintura[i][j] == pintura[i + 1][j] &&
                pintura[i][j] == pintura[i + 1 ][j+1] ){
                    original = false ;
                } 
            }
        }
        System.out.println((original) ? "ORIGINAL" : "NO ORIGINAL");

        scanner.close();
        
    }
}
