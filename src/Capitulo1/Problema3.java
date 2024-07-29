package Capitulo1;

import java.util.Scanner;

public class Problema3 {
    //print the letter of DNI
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        char leter = txt.charAt(txt.length()-1);
        System.out.println(leter);
        scanner.close();

    }
}
