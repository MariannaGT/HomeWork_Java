// 1.Задать целочисленный массив, состоящий из элементов 0 и 1.//
// * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*//
 
package ru.gb;
import java.util.Scanner;
public class Main {
    public static int[] vary(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
}

// 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public static void modifierForArrayes(int[] array){
    for(int i = 0; i < array.length; i++){
        if(array[i] < 6){
            array[i] *= 2;
        }
    }
}

//  3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//  Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

public static void SquareArray(int size){
    int[][] array = new int[size][size];
    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
            array[i][j] = (i == j & j == (size - i - 1))? 1 : (int)(Math.random()*100);
            System.out.printf("%4d", array[i][j]);
        }
        System.out.println();
    }
}

//4. Задать одномерный массив и найти в нем минимальный и максимальный элементы;

public static void arrayMinMax() {
    int[] array = {1, 5, -10, 100};
    int min = 0;
    int max = 0;
    for (int i = 0; i < array.length; i++) {
        if (i == 0) {
            min = array[0];
            max = array[0];
        }
        if (array[i] < min) {
            min = array[i];
        }
        if (array[i] > max) {
            max = array[i];
        }
    }
    System.out.println("Минимальный элемент: " + min);
    System.out.println("Максимальный элемент: " + max);
    }
}