package Capitulo3;

import java.util.Scanner;

public class ProblemaE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Sum(num));
        scanner.close();
    }

    public static int Sum(int n){
        String numero = String.valueOf(n);
        int sum = 0 ;
        for(char c : numero.toCharArray()){
            sum += c - '0' ;
        }
        return sum;
    }
}
