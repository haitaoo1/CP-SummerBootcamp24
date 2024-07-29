package Capitulo2;

import java.util.Scanner;

public class ProblemaI{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int y = scanner.nextInt();
        double res = Math.sqrt(y);
        System.out.println(res);
        
        scanner.close();
        
    }
}
