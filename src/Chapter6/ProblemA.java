package Chapter6;

import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        count(n);
        scanner.close();
    }

    public static void count(int n){
        if(n < 1){return;}
        
        System.out.println(n);
        
        count(n - 1);
    }
}
