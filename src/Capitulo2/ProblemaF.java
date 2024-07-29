package Capitulo2;

import java.util.Scanner;

public class ProblemaF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int complement = ~N;  
        System.out.println(complement);

        scanner.close();
    }
    
}
