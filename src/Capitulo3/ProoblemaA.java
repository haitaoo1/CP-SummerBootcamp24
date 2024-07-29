package Capitulo3;

import java.util.Scanner;

public class ProoblemaA {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weather = scanner.next();
        int temp = scanner.nextInt();
        scanner.close();
        StringBuilder person = new StringBuilder();

        if (weather.equals("Soleado")&& temp >= 20) {
            person.append("Adrian ");
        }
        if (weather.equals("Soleado") || temp > 15) {
            person.append("Barbara ");
        }
        if (weather.equals("Soleado") || weather.equals("Nublado")){
            person.append("Carmen ");
        }
        if (!weather.equals("Tormenta") ){
            person.append("Dario ");
        }

        String res = "Vienen a pasear: " +  (person.length() > 0 ? person.toString() : ""); 
    
        System.out.println(res);
    }
}
