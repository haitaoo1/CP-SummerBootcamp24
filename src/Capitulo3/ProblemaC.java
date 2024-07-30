package Capitulo3;

import java.util.Scanner;
import java.util.Locale;

public class ProblemaC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        int N = scanner.nextInt();

        double[] areas = new double[N];

        for (int i = 0; i < N; i++) {
            int F = scanner.nextInt(); 

            switch (F) {
                case 1: 
                    double R = scanner.nextDouble();
                    areas[i] = 3.141592 *  R * R;
                    break;
                case 2: 
                    double X = scanner.nextDouble();
                    areas[i] =Math.pow(X, 2);
                    break;
                case 3:
                    double Xr = scanner.nextDouble();
                    double Yr = scanner.nextDouble();
                    areas[i] = Xr * Yr;
                    break;
                case 4: 
                default: 
                    double B = scanner.nextDouble();
                    double A = scanner.nextDouble();
                    areas[i] =(B * A) / 2 ;
                    break;
            }
        }


        for (double area : areas) {
            System.out.printf("%.5f\n", area);
        }

        scanner.close();
    }

}
