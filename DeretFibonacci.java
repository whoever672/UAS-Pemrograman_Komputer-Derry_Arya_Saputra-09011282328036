package com.uas;

import java.util.Scanner;

public class DeretFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input suku ke-n
        System.out.print("Masukkan suku ke-n: ");
        int n = input.nextInt();

        // Inisialisasi suku pertama dan kedua
        int f1 = 0;
        int f2 = 1;

        // Tampilkan deret Fibonacci
        System.out.print("Deret Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            int fn = f1 + f2;
            System.out.print(fn + " ");

            // Update suku pertama dan kedua
            f1 = f2;
            f2 = fn;
        }
    }
}
