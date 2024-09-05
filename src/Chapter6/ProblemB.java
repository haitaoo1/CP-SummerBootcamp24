package Chapter6;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(ingredients(n));
        scanner.close();

    }

    private static int ingredients(int n) {
        if(n == 1 || n == 2){
            return 1;
        }

        return ingredients(n - 1) + ingredients(n - 2);
    }
}
