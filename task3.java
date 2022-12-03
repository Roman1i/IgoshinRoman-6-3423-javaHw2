package java_hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task3 {
    public static void main(String[] args){
        ArrayList<Integer> lst = new ArrayList<>();
        fill_random(lst, 10);
        System.out.println("Исходний список");
        System.out.println(lst.toString());
        System.out.print("\nМинимальное значение: ");
        System.out.println(min(lst));
        System.out.print("\nМаксимальное значение: ");
        System.out.println(max(lst));
        System.out.print("\nСреднее значение: ");
        System.out.println(mid(lst));
    }


    static void fill_random(List<Integer> arr, int size){
        Random r = new Random();
        for (int i = 0; i < size; i++){
            arr.add(r.nextInt(100));
        }
    }


    static int min(ArrayList<Integer> lst){
        int min = lst.get(0);
        for (int i = 1; i < lst.size(); i++){
            if (lst.get(i) < min) min = lst.get(i);
        } return min;
    }
    

    static int max(ArrayList<Integer> lst){
        int max = lst.get(0);
        for (int i = 1; i < lst.size(); i++){
            if (lst.get(i) > max) max = lst.get(i);
        } return max;
    }


    static double mid(ArrayList<Integer> lst){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < lst.size(); i++){
            sum += lst.get(i);
            count++;
        }
        double result = sum / count;
        return result;
    }
}
