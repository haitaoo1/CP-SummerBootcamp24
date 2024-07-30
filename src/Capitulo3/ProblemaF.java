package Capitulo3;

import java.util.Scanner;

public class ProblemaF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comp = scanner.nextInt();

        while(scanner.hasNext()){
           int act = scanner.nextInt();
            if( act > comp){
                System.out.print("S");
            }else if( act < comp){
                System.out.print("B");
            }else{
                System.out.print("I"); 
            }
            comp = act;
        } 
        scanner.close();
    }
}
