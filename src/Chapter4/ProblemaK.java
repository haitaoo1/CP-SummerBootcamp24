package Chapter4;

import java.util.Scanner;

public class ProblemaK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        char[][] tablero = new char[N][M];
        for (int i = 0; i < N; i++) {
            tablero[i] = scanner.nextLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(tablero[i][j] == '*') {
                    tablero[i][j] = 'F';
                }else{
                    int minas = 0;
                    
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int nx = i + x;
                            int ny = j + y;
                            
                            if(nx >= 0 && ny >= 0 && nx < N && ny < M && (tablero[nx][ny] == '*' || tablero[nx][ny] == 'F')){
                                minas++;
                            }

                        }
                    }

                    if(minas > 0){
                        tablero[i][j] = (char) (minas + '0');
                    }else{
                        tablero[i][j] =' ';
                    }


                }
                
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(tablero[i]);
        }

        
        scanner.close();

    }
    
}
