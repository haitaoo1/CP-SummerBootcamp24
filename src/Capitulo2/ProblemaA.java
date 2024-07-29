package Capitulo2;

import java.util.Scanner;

public class ProblemaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextInt();
        long n2 = scanner.nextInt();
        System.out.println(n1+n2);
        scanner.close();
    }
}