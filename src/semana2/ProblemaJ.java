package semana2;

import java.util.Scanner;

public class ProblemaJ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double y = scanner.nextDouble();
        double res = Math.log(y) / Math.log(2);
        System.out.println(res);
        
        scanner.close();
        
    }
}
