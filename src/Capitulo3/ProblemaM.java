package Capitulo3;

import java.util.Scanner;

public class ProblemaM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastLine = ""; 
        
        while (scanner.hasNextLine()) {
            lastLine = scanner.nextLine();
            if(lastLine.length() % 2 == 1){System.out.println(lastLine);}
            else{
                StringBuilder invert = new StringBuilder();

                for (int i = lastLine.length() - 1; i >= 0 ; i--) {
                    invert.append(lastLine.charAt(i));                    
                }
                invert.toString();
                System.out.println(invert);
            }
        }

        scanner.close();
    }
}
