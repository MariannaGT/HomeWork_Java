// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class err_list {
   
        public static void main(String[] args) {
            Random ranNum = new Random();
            int capacity = 20;
            int minNum,maxNum;
            float averNum=0;
            ArrayList<Integer> listNumb = new ArrayList<Integer>(capacity);
            for (int i = 0; i < capacity; i++) {
                listNumb.add(ranNum.nextInt(100));
                averNum=averNum+listNumb.get(i);
            }
            System.out.println("Исходный целочисленный список чисел: ");
            System.out.println(listNumb);
            Collections.sort(listNumb);
            minNum=listNumb.get(0);
            maxNum=listNumb.get(capacity-1);
            System.out.println("\nСумма чисел списка = "+averNum);
            averNum=averNum/capacity;
            System.out.println("Минимальное число = "+minNum);
            System.out.println("Максимальное число = "+maxNum);
            System.out.println("Среднее арифметическое число = "+averNum);
            }
    }
