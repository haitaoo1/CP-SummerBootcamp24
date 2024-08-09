package Chapter4;

import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vowels = "aeiou";
        
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            int vowel = 0;
            String line = scanner.nextLine().replace(" ", "");
            String[] chart = line.split("");
            for (int j = 0; j < chart.length; j++) {
               if(vowels.indexOf(chart[j]) != -1){
                 vowel++;
               }
            }
            System.out.println(vowel + " " + chart.length);
        }
        
        scanner.close();
    }    
}
