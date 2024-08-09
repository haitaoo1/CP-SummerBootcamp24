package Chapter3;

import java.util.Scanner;

public class ProblemaK {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int C = scanner.nextInt(); 
            boolean found = false;

            for (int i = 0; i < N; i++) {
                int B = scanner.nextInt(); 
                if (B == C) {
                    found = true;
                }
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
