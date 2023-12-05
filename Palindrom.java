package com.uas;

import java.util.Scanner;

public class Palindrom {

    public static boolean isPalindrome(String kata) {
        // Buat variabel untuk menyimpan indeks awal dan akhir
        int awal = 0;
        int akhir = kata.length() - 1;

        // Periksa karakter dari awal hingga akhir
        while (awal <= akhir) {
            // Jika karakter tidak sama, maka kata tersebut bukan palindrom
            if (kata.charAt(awal) != kata.charAt(akhir)) {
                return false;
            }

            // Increment indeks awal dan akhir
            awal++;
            akhir--;
        }

        // Jika semua karakter sama, maka kata tersebut adalah palindrom
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kata atau frase
        System.out.print("Masukkan kata atau frase: ");
        String kata = input.nextLine();

        // Cek apakah kata atau frase tersebut adalah palindrom
        boolean hasil = isPalindrome(kata);

        // Tampilkan hasil
        if (hasil) {
            System.out.println("Kata atau frase tersebut adalah palindrom");
        } else {
            System.out.println("Kata atau frase tersebut bukan palindrom");
        }
    }
}
