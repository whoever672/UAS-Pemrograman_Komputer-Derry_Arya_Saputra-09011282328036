package com.uas;

import java.util.Scanner;

public class Faktorisasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input bilangan bulat positif
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        // Inisialisasi variabel
        int faktor = 2;
        String faktorisasi = "";

        // Faktorisasi bilangan
        while (n > 1) {
            if (n % faktor == 0) {
                faktorisasi += faktor + " * ";
                n /= faktor;
            } else {
                faktor++;
            }
        }

        // Hapus spasi terakhir
        faktorisasi = faktorisasi.substring(0, faktorisasi.length() - 2);

        // Tampilkan faktorisasi
        System.out.println("Faktorisasi " + n + ": " + faktorisasi);
    }
}
