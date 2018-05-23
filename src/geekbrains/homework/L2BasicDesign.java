package geekbrains.homework;

import java.util.Arrays;

/**
 * @author Andrey Knyazev
 * @version dated by 17.05.2018
 */
public class L2BasicDesign {

    public static void main(String[] args) {
        System.out.println(intArr());
        System.out.println(fillEmptyArray());
        System.out.println(goThrough());
        System.out.println(fillDiagonal());
        System.out.println(findMaxAndMin());
    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static String intArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) arr[i] = (arr[i] > 0) ? 0 : 1;
        return Arrays.toString(arr);
    }

    /*
    2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    static String fillEmptyArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) arr[i] = i * 3;
        return Arrays.toString(arr);
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static String goThrough() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) arr[i] = (arr[i] < 6 ? arr[i] * 2 : arr[i]);
        return Arrays.toString(arr);
    }

    /*
    4. Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    static int[][] fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if ((i + j) == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    /*
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    (без помощи интернета);
     */
    static String findMaxAndMin() {
        int[] arr = {6, 30, 18, 12, 11, 24, 30, 12, 24, 8, 9, 6};
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
        }
        String result = "Максимум: " + max + ", Минимум: " + min;
        return result;
    }
}






