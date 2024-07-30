package Capitulo3;

import java.util.Scanner;

public class ProblemaD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int person = scanner.nextInt();

        for (int i = 0; i < person; i++) {
            int g = scanner.nextInt();
            if(g == num){
                System.out.print("1p ");
            }else if(Math.abs(num - g) <= 5){
                System.out.print("0.5p ");
            }else if(Math.abs(num - g) <= 10){
                System.out.print("0.25p ");
            }else{
                System.out.print("0p ");
            }
        }

        scanner.close();
    }
}
