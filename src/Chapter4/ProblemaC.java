package Chapter4;

import java.util.Scanner;

public class ProblemaC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] Array1 = new int[n];
        int[] Array2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            Array1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            Array2[i] = scanner.nextInt();
        }
        
        int[] Aux1 = new int[n];
        int[] Aux2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                Aux1[i] = Array1[i];
                Aux2[i] = Array2[i];
            } else {
                Aux1[i] = Array2[i];
                Aux2[i] = Array1[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(Aux1[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.print(Aux2[i] + " ");
        }
    }
}
