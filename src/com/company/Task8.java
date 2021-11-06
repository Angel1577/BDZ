package com.company;

import java.util.Scanner;
// С клавиатуры вводится целое число n.
// Вывести разложение числа n на простые множители.

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 2;
        while (n != 1) {
            if (n % k == 0) {
                System.out.print(k + " ");
                n /= k;
            }
            else if (k == 2)
                k++;
            else
                k += 2;
        }
    }
}