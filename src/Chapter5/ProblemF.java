package Chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] num = new int[n];
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

    public static void merge(List<Integer> res, List<Integer> l1, List<Integer> l2) {
        int i1 = 0, i2 = 0;
        for (int i = 0; i < res.size(); i++) {
            if (i1 == l1.size()) {
                res.set(i, l2.get(i2++));
            } else if (i2 == l2.size()) {
                res.set(i, l1.get(i1++));
            } else if (l2.get(i2) < l1.get(i1)) {
                res.set(i, l2.get(i2++));
            } else {
                res.set(i, l1.get(i1++));
            }
        }
    }

    public static void mergeSort(List<Integer> l) {
       //caso base
        if (l.size() == 1) return;
        
        int mid = (l.size() / 2) - 1;
        List<Integer> l1 = new ArrayList<>(l.subList(0, mid + 1));
        List<Integer> l2 = new ArrayList<>(l.subList(mid + 1, l.size()));
        
        mergeSort(l1);
        mergeSort(l2);
        
        merge(l, l1, l2);
    }
}
