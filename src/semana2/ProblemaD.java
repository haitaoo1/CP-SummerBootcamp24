package semana2;

import java.util.Scanner;

public class ProblemaD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int izq = n << k ;
        int der = n >> k ;
        
        System.out.println(izq);
        System.out.println(der);
        scanner.close();

    }
    
}
