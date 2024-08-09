package Chapter3;

import java.util.Scanner;

public class ProblemaL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int v = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        
        for (int i = 0; i < p; i++) {
           String linea = scanner.nextLine();
           String[] caract = linea.split(" ");
           
           for (int j = 0; j < v * 2; j+= 2 ) {
                if(caract[j].equals("#") || caract[j+1].equals("#")){
                    count++;
                }
           }
        }
        System.out.println(count);
        scanner.close();
    }
}
