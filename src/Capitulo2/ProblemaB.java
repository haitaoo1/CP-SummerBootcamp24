package Capitulo2;

import java.util.Scanner;

public class ProblemaB {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextInt();
        
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        
        System.out.println(n + a); 
        System.out.println(n - b); 
        System.out.println(n * c); 
        System.out.println(n / d);
        System.out.println(n % d); 
        
        scanner.close();
    }
}
