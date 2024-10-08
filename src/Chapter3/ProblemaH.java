package Chapter3;

import java.util.Scanner;

public class ProblemaH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(num > max) {max = num;}
            if(num < min) {min = num;}
        }
        System.out.println(min + " "+ max);
        scanner.close();
    }
}
