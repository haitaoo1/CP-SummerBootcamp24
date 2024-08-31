package Chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        // int[] num = new int[n];
        // for (int i = 0; i < n; i++) {
        //     num[i] = scanner.nextInt();
        // }
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numList.add(scanner.nextInt());
        }


        mergeSort(numList);

        for (int i = 0; i < n; i++) {
            System.out.print(numList.get(i) + " ");
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(num[i] + " ");
        // }
        scanner.close();

    }

    static int[] bubbleSort (int[] num, int n){

        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n - 1 ; j++) {
                if(num[j] > num [j + 1]){
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1 ] = temp;
                }
            }
        }
        return num;
    }

    static int[] insertionSort(int[]num, int n){
        int temp = 0;
       for (int i = 1; i < n; i++) {
            temp = num[i];
            int j = i - 1;
            while(j >= 0 && num[j] > temp){
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j + 1] = temp;
       }     
        return num;
    }

    static int[] selectionSort(int[]num , int n){
        int minIndex;
        for (int i = 0; i < num.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[minIndex]) { minIndex = j;
                }
            }
            
        int temp = num[minIndex];
        num[minIndex] = num[i];
        num[i] = temp;
        }
        return num;
    }
    //merge Sort
    public static void merge(List<Integer> listNum,List<Integer> l1, List<Integer> l2 ) {
        int i1 = 0, i2 = 0;
        
        for (int i = 0; i < listNum.size(); i++) {
            if( i1 == l1.size()){
                listNum.set(i, l2.get(i2++));
            }else if( i2 == l2.size()){
                listNum.set(i, l1.get(i1++));
            }else if(l1.get(i1) > l2.get(i2)){
                listNum.set(i, l2.get(i2++));
            }else{
                listNum.set(i, l1.get(i1++));
            }
        }
    }

    public static void mergeSort(List<Integer> listNum) {
       //caso base
       int length = listNum.size();
       if (length == 1) {return; }

       int mid = (length / 2) - 1;

       List<Integer> l1 = new ArrayList<>(listNum.subList(0, mid + 1 ));
       List<Integer> l2 = new ArrayList<>(listNum.subList(mid + 1 , length));
    
       mergeSort(l1);
       mergeSort(l2);

       merge(listNum, l1, l2);

    }


    //quickSort
    public static void quickSort(int[] a, int ini, int fin){
        if(fin - ini < 1 ) return;
        
        int pivote = a[fin];
        int i = ini, j = ini;

        while(j <= fin){

            if (a[j] < pivote) {
                swap(a, i , j);
                i++;
            }
            j++;
        }
        //cambiar el pivote
        swap(a, i, fin);

        quickSort(a, ini, i - 1);
        quickSort(a, i + 1, fin);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void pigeonholeSort(int[] array) {
        ///max and min value
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        int range = max - min + 1;
        int[] aux = new int[range];
        Arrays.fill(aux, 0);
        //fill aux
        for (int i = 0; i < array.length; i++) {
            aux[array[i] - min]++;
        }

        //invert
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (aux[i] > 0) {
                array[index++] = i + min;
                aux[i]--;
            }
        }

    }

    static void radixSort(int arr[], int n){
        int exp,  max;
        max = getMax(arr, n);
        for(exp = 1; max/exp > 0; exp*= 10){
            countSort(arr, n, exp);
        }
    }

    private static void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n]; 
        int[] count = new int[10]; 
        Arrays.fill(count, 0); 

        // Conteo de las ocurrencias de cada dígito
        for (int i = 0; i < n; i++) {
            int index = (arr[i] / exp) % 10;
            count[index]++;
        }

        // Modificar count[i] para que contenga la posición actual de este dígito en output
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construir el array de salida
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copiar el array de salida a arr[], para que arr[] ahora contenga los números ordenados según el dígito actual
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }


}
