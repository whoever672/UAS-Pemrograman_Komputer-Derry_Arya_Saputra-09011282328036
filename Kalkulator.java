package com.uas;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean lanjutkan = true;
        while (lanjutkan) {
            // Menu operasi kalkulator
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            int pilihan = input.nextInt();

            // Input bilangan
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = input.nextInt();

            // Panggil metode sesuai pilihan
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil penjumlahan: " + penjumlahan(bilangan1, bilangan2));
                    break;
                case 2:
                    System.out.println("Hasil pengurangan: " + pengurangan(bilangan1, bilangan2));
                    break;
                case 3:
                    System.out.println("Hasil perkalian: " + perkalian(bilangan1, bilangan2));
                    break;
                case 4:
                    if (bilangan2 == 0) {
                        System.out.println("Pembagian dengan nol tidak valid.");
                    } else {
                        System.out.println("Hasil pembagian: " + pembagian(bilangan1, bilangan2));
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            // Tanya user apakah ingin melakukan perhitungan lagi
            System.out.print("Apakah Anda ingin melakukan perhitungan lagi? (ya/tidak) ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                lanjutkan = false;
            }
        }

        input.close();
    }

    // Metode untuk penjumlahan
    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public static int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode untuk perkalian
    public static int perkalian(int a, int b) {
        return a * b;
    }

    // Metode untuk pembagian
    public static double pembagian(int a, int b) {
        return (double) a / b;
    }
}
