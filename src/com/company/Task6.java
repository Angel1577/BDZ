package com.company;

// Напишите программу, которая в последовательности натуральных чисел
// определяет максимальное число, оканчивающееся на 11. Программа
// получает на вход количество чисел в последовательности, а затем
// сами числа. В последовательности всегда имеется число,
// оканчивающееся на 11. Программа должна вывести одно число
// —максимальное число, оканчивающееся на 11.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 100 == 11 && array[i] % 100 == -11)
                if (array[i]>max)
                    max=array[i];
        }
        System.out.println(max);
    }
}
