package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0){
            sum += n;
            n = scanner.nextInt();
        }
        if (sum > 0)
            System.out.println((int)Math.sqrt(sum));
        else
            System.out.println("Сумма меньше 0");
    }
}
