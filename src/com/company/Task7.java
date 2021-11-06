package com.company;

//  Даны два числа n и m. Вывести на экран таблицу
//  умножения размером n на m, т.е. элемент, находящийся
//  в i строке и j столбце имел значение I ∗ j.
//Пример:
//Входные данные:
//5 6
//Выходные данные:
//1   2   3   4    5
//2   4   6   8   10
//3   6   9   12  15
//4   8   12  16  20
//5   10  15  20  25
//6   12  18  24  30


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int [m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i+1)*(j+1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
