package Chapter4;

import java.util.Scanner;


public class ProblemF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        scanner.nextLine();
        scanner.nextLine();

        char[][] antes = new char[L][L];
        char[][] despues = new char[L][L];
        boolean mermelada = false;
        boolean tragedia = false;

        for (int i = 0; i < L; i++) {
            antes[i] = scanner.nextLine().toCharArray();
        }

        scanner.nextLine(); 

        for (int i = 0; i < L; i++) {
            despues[i] = scanner.nextLine().toCharArray();
        }

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                if (antes[i][j] == '#' || despues[i][j] == '#') {
                    mermelada = true;
                } 

                if (antes[i][j] != despues[i][j]) {
                    tragedia = true;
                } 
            } 
    
        }
        scanner.close();
        if (!mermelada) {
            System.out.println("NO LLEVABA MERMELADA");
        }else if(tragedia){
            System.out.println("TRAGEDIA");
        }else{System.out.println("HA HABIDO SUERTE");}

     }     
    }
    

