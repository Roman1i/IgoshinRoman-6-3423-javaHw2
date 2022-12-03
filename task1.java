package java_hw3;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nУкажите размер списка: ");
        int size = scan.nextInt();
        scan.close();
        int[] arr = new int[size];
        fill_random(arr);
        System.out.println("\nИсходний список");
        for (int i : arr) System.out.print(i+" ");
        merge_sort(arr);
        System.out.println("\n");
        System.out.println("Отсортированный список");
        for (int i : arr) System.out.print(i+" ");
    }


    static void fill_random(int[] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100);
        }
    }


    static void merge_sort(int[] array){
        if (array.length == 1) return;
        else{
            int[] second = new int[array.length / 2];
            int[] first = new int[array.length - second.length];
            int i = 0;
            int k = 0;

            while (i < first.length) first[i++] = array[k++];
            i = 0;
            while (i < second.length) second[i++] = array[k++];
            
            merge_sort(first);
            merge_sort(second);
            merge(array, first, second);
            
        }
    }


    static void merge(int[] array, int[] first, int[] second){
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length){
            if (first[i] < second[j]) array[k++] = first[i++];
            else array[k++] = second[j++];
        } if (i == first.length){
            while (j < second.length) array[k++] = second[j++];    
        } if (j == second.length){
            while (i < first.length) array[k++] = first[i++];
        }
    }
}


