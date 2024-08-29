package Chapter5;

import java.util.*;

public class ProblemD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, List<String>> cafes = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            int calidad = scanner.nextInt();
            String nombre = scanner.next();

            cafes.putIfAbsent(calidad, new ArrayList<>());
            cafes.get(calidad).add(nombre);

        }
        
        for(Map.Entry<Integer , List<String>> entry : cafes.entrySet()){
            Collections.sort(entry.getValue());
        }

        for(Map.Entry<Integer , List<String>> entry : cafes.entrySet()){
            int calidad = entry.getKey();

            for(String etiqueta : entry.getValue()){
                
                System.out.println(calidad + " " + etiqueta);
            }

        }
        scanner.close();
    }
}
