package com.uas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HitungDiskon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Continuously prompt for valid integer input
        int jumlahBarang = -1;
        while (jumlahBarang < 0) {
            try {
                System.out.print("Jumlah barang: ");
                jumlahBarang = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input salah, masukkan jumlah barang dalam bentuk integer");
                input.nextLine(); // Clear the input buffer
            }
        }

        // Continuously prompt for valid integer input
        int hargaBarang = -1;
        while (hargaBarang < 0) {
            try {
                System.out.print("Harga barang: ");
                hargaBarang = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input salah, masukkan harga barang dalam bentuk bilangan bulat");
                input.nextLine(); // Clear the input buffer
            }
        }

        // Calculate discount based on the number of items purchased
        int diskon = 0;
        if (jumlahBarang < 5) {
            diskon = 0;
        } else if (jumlahBarang <= 10) {
            diskon = 5;
        } else if (jumlahBarang <= 20) {
            diskon = 10;
        } else {
            diskon = 20;
        }

        // Calculate the total price
        int totalHarga = jumlahBarang * hargaBarang;
        totalHarga -= totalHarga * diskon / 100;

        // Display the result
        System.out.println("Total harga: Rp" + totalHarga);
    }
}
