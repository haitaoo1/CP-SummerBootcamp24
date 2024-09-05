package Chapter6;

import java.util.Scanner;

public class ProblemC {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(numbers(n));
        scanner.close();
     }

    private static int numbers(int n) {
        if(n == 1){return 1;}
        return  n + numbers(n - 1);
    }
    
}
