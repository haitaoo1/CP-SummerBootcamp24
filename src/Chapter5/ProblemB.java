package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] size = new int[N];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            size[i] = scanner.nextInt();
        }
        Arrays.sort(size);

        for (int i = 0; i < N - 1; i++) {
            int diff = Math.abs(size[i] - size[i+1]);
            if ( diff < min) {
                min = diff;           
            }
        }

        System.out.println(min);

        scanner.close();

    }
}
