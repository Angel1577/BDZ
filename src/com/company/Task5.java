package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String string = "";
        for(int i = 0; i < n; i++){
            string += scanner.nextLine().charAt(0);
        }
        System.out.println(string);
    }
}
