package Chapter4;

import java.util.Scanner;

public class ProblemaE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < casos; i++) {
           String caso = scanner.nextLine();
           
           StringBuilder text = new StringBuilder("*");
           for(char c : caso.toCharArray()){
                if(c == ' '){
                    text.append("**");
                }else{
                    text.append(" ").append(c).append(" *");
                }
           }
           String topBot = "*".repeat(text.length());
           System.out.println(topBot);
           System.out.println(text.toString());
           System.out.println(topBot);
        }
        
        scanner.close();
    }
}

