// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого).


import java.util.ArrayList;
import java.util.Random;

public class arr {
  
    public static void main(String[] args) {
        Random rndNumb = new Random();
        int capacity = 20;
        ArrayList<Integer> listNumb = new ArrayList<Integer>(capacity);
        ArrayList<Integer> listEvenNumb = new ArrayList<Integer>(capacity);
        for (int i = 0; i < capacity; i++) {
            listNumb.add(rndNumb.nextInt(100));
        }
        System.out.println("Произвольный список целых чисел: ");
        System.out.println(listNumb);
        for (int i = 0; i < capacity; i++) {
            if ((listNumb.get(i) % 2) == 0) {
                listEvenNumb.add(listNumb.get(i));
            }
        }
        listNumb.removeAll(listEvenNumb);
        System.out.println("Тот же список, после удаления всех четных чисел: ");
        System.out.println(listNumb);
    }
}