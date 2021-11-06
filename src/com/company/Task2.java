package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
            if (array[i]>max)
                max=array[i];
            if (array[i]<min)
                min=array[i];
        }
        float mean = sum / n;
        System.out.println(max);
        System.out.println(min);
        System.out.println(mean);
    }
}
