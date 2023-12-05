package com.uas;

import java.util.Scanner;

public class AutentikasiPengguna {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat username dan password
        System.out.print("Buat username: ");
        String username = input.nextLine();
        System.out.print("Buat password: ");
        String password = input.nextLine();

        // Simpan username dan password ke database
        // ...

        // Lakukan autentikasi
        System.out.print("Username: ");
        String usernameMasuk = input.nextLine();
        System.out.print("Password: ");
        String passwordMasuk = input.nextLine();

        if (usernameMasuk.equals(username) && passwordMasuk.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}
