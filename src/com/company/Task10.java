package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.print(addition(n, m));
    }
    public static int addition(int n, int m) {
        while (m != 0) {
           int a = (n & m);
            n ^= m;
            m = a << 1;
        } return n;
    }
}
