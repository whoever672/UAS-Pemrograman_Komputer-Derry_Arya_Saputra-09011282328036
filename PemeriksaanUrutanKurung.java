package com.uas;

import java.util.Scanner;
import java.util.Stack;

public class PemeriksaanUrutanKurung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Masukkan ekspresi matematika: ");
            String ekspresi = scanner.nextLine();

            // Buat stack untuk menyimpan kurung buka
            Stack<Character> stack = new Stack<>();

            // Iterasi ekspresi
            for (char karakter : ekspresi.toCharArray()) {
                // Jika karakter adalah kurung buka, masukkan ke dalam stack
                if (karakter == '(') {
                    stack.push(karakter);
                }

                // Jika karakter adalah kurung tutup, keluarkan dari stack
                else if (karakter == ')') {
                    // Jika stack kosong, berarti urutan kurung salah
                    if (stack.isEmpty()) {
                        System.out.println("Urutan kurung salah");
                        break;
                    }

                    // Jika karakter yang dikeluarkan dari stack bukan kurung buka, berarti urutan kurung salah
                    if (stack.pop() != '(') {
                        System.out.println("Urutan kurung salah");
                        break;
                    }
                }
            }

            // Jika stack masih tidak kosong, berarti ada kurung buka yang tidak berpasangan
            if (!stack.isEmpty()) {
                System.out.println("Urutan kurung salah");
            } else {
                System.out.println("Urutan kurung benar");
            }

            System.out.print("Apakah ingin memeriksa ekspresi lain? (y/n): ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program pemeriksaan urutan kurung.");
    }
}
