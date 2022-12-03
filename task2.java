package java_hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scan.nextInt();
        scan.close();
        fill_random(list, size);
        System.out.println("\nИсходный список");
        System.out.println(list.toString());
        del(list);
        System.out.println("\nРезультат");
        System.out.println(list.toString());
    }


    static void fill_random(List<Integer> arr, int size){
        Random r = new Random();
        for (int i = 0; i < size; i++){
            arr.add(r.nextInt(100));
        }
    }


    static void del(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0) list.remove(i--);
        }
    }
    
}
