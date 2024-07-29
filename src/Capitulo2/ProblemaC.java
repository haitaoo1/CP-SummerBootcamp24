package Capitulo2;

import java.util.Scanner;

public class ProblemaC {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();  
        long B = scanner.nextLong();  

        long suma = A + B;
        long producto = A * B;

        System.out.println(suma);
        System.out.println(producto);

        scanner.close();
    }
    
}
