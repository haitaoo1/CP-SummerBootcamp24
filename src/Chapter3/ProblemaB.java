package Chapter3;

import java.util.Scanner;

public class ProblemaB {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        scanner.close();
        
        double operacion = 0.0;
        boolean esCero = false;
        String resultado = "";


        switch (op) {
            case '+':
                operacion = num1 + num2;
                resultado = String.format("%.0f", operacion);
                break;
            case '-':
                operacion = num1 - num2;
                resultado = String.format("%.0f", operacion);
                break;
            case '*':
                operacion = num1 * num2;
                resultado = String.format("%.0f", operacion);
                break;
            case '/':
                if (num2 == 0) {
                    esCero = true;
                } else {
                    operacion = (double) num1 / num2;
                    resultado = String.format("%.2f", operacion);
                }
                break;
            default:
                break;
        }

        if (esCero) {
            System.out.println("ERROR");
        } else {
            System.out.println(resultado);
        }
    }
}
