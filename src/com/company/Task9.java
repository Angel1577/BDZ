package com.company;

// С клавиатуры вводится натуральное число n.
// Вывести на экран “Yes”, если данное число
// n является палиндромом, в противном случае вывести “No”.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int a;
        int copy = n;
        while (n > 0) {
            a = n % 10;
            sum = (sum * 10) + a;
            n = n / 10;
        }
        if (copy == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
