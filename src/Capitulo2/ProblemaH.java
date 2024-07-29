package Capitulo2;

import java.util.Scanner;

public class ProblemaH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double y = scanner.nextDouble();
        double res = Math.log(y);
        System.out.println(res);
        
        scanner.close();
        
    }
}
