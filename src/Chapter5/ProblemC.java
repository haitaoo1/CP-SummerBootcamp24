package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

//binary search
public class ProblemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int[] libros = new int[N];

        for (int i = 0; i < N; i++) {
            libros[i] = scanner.nextInt();
        }
        Arrays.sort(libros);
        scanner.nextLine();
        int consultas = scanner.nextInt();

        
        for (int i = 0; i < consultas; i++) {

        int lib = scanner.nextInt();
        System.out.println(existeLibro(lib, libros) ? "YES": "NO" );           
        } 

        scanner.close();
    }

    static boolean existeLibro(int buscarLibro, int[] libros){

        int izq = 0, der = libros.length - 1, mid = 0;
        
        while (izq <= der) {
            mid = (izq + der) / 2;
           
            if(libros[mid] == buscarLibro){ return true;}
            else if (libros[mid] > buscarLibro) {
                der = mid - 1;
            }else{
                izq = mid + 1;
            }
        }
        return false;
    }
}
