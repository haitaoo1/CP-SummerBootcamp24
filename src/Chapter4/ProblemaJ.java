package Chapter4;

import java.util.Scanner;
import java.util.Locale;


public class ProblemaJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 

        int t = sc.nextInt();  
        for (int caso = 0; caso < t; caso++) {
            int m = sc.nextInt();  
            int n = sc.nextInt();  
            double epsilon = sc.nextDouble();  
            sc.nextLine();
  
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    double valor = sc.nextDouble();
                    if (Math.abs(valor) <= epsilon) {
                        valor = 0.0;
                    }
                    System.out.printf("%.6f", valor);
                    if (j < n - 1) {
                        System.out.print(" ");
                    }
                }
                sc.nextLine();
                System.out.println();
            }
        }

        sc.close();
    }
}
