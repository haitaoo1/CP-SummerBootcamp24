package Chapter2;

import java.util.Scanner;

public class ProblemaG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int d = scanner.nextInt();
        long res = (long) Math.pow(w, d);
        System.out.println(res);

        scanner.close();
    }
    
}
