package Chapter6;

import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        flecha(n, 1);

        scanner.close();
    }

    private static void flecha(int n, int curr) {
        
        if(curr > n ){return;}

        for (int i = 0; i < curr; i++) {
            System.out.print("#");
        }
        System.out.println();
        
        flecha(n, curr + 1);

        if(curr < n){
            for (int i = 0; i < curr; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
        
        

    }
}
