package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j<array.length-1; j++) {
            for (int k = j+1; k < array.length; k++){
                if (array[k] < array[j]) {
                    int a = array[k];
                    array[k] = array[j];
                    array[j] = a;
                }
            }
        }
        for (int i = array.length-5; i < n+1; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
