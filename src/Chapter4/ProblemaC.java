package Chapter4;

import java.util.Scanner;

public class ProblemaC {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " " + B[i+1] + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " " + A[i+1] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
