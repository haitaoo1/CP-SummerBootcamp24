package Chapter3;

import java.util.Scanner;

public class ProblemaI {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        long  sum = 0;

        while(scanner.hasNext()){
           int n = scanner.nextInt();
           sum += n;
           System.out.print(sum + " ");
        } 
        scanner.close();
    }
    
}
