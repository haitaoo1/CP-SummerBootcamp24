package Capitulo2;

import java.util.Scanner;

public class ProblemaE {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int X = A & B;

        int Y = X | C;

        int Z = Y ^ B;

        System.out.println(X + " " + Y + " " + Z);

        scanner.close();
 }   
}
