package Capitulo3;

import java.util.Scanner;

public class ProblemaJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastLine = ""; 

        
        while (scanner.hasNextLine()) {
            lastLine = scanner.nextLine();
        }
        System.out.println(lastLine);

        scanner.close();
    }
}
