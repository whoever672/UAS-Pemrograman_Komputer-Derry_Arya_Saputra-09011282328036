package com.uas;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String username;
    private String password;
    private boolean isActive;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true;
    }

    public String getUsername() {
        return username;
    }

    public boolean isActive() {
        return isActive;
    }

    public void activate() {
        isActive = true;
    }

    public void deactivate() {
        isActive = false;
    }
}

public class AkunPengguna{

    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Buat Akun");
            System.out.println("2. Tampilkan Daftar Akun"); 
            System.out.println("3. Autentikasi Akun");
            System.out.println("4. Kelola Akun");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccounts();
                    break;
                case 3:
                    authenticate();
                    break;
                case 4:
                    manageAccounts();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (choice != 5);

    }

    private static void createAccount() {
        System.out.print("Masukkan username: ");
        String username = input.next();
        System.out.print("Masukkan password: "); 
        String password = input.next();

        Account account = new Account(username, password);
        accounts.add(account);

        System.out.println("Akun berhasil dibuat!");
    }

    private static void viewAccounts() {
        if (accounts.size() == 0) {
            System.out.println("Belum ada akun!");
            return;
        }

        for (Account account : accounts) {
            System.out.println("Username: " + account.getUsername());
            System.out.println("Status: " + (account.isActive() ? "Aktif" : "Non-aktif")); 
            System.out.println();
        }
    }

    private static void authenticate() {
        System.out.print("Masukkan username: ");
        String username = input.next();
        System.out.print("Masukkan password: ");
        String password = input.next();  

        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.isActive()) {
                System.out.println("Autentikasi berhasil!");
                return; 
            }
        }

        System.out.println("\u001B[31mAutentikasi Gagal!\u001B[0m"); 
    }

    private static void manageAccounts() {
        if (accounts.size() == 0) {
            System.out.println("Belum ada akun!");
            return;
        }

        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i+1) + ". " + accounts.get(i).getUsername());
        }

        System.out.print("Pilih akun (berdasarkan nomor): ");
        int index = input.nextInt()-1; 

        if (index < 0 || index >= accounts.size()) {
            System.out.println("Nomor akun tidak valid");
            return;
        }

        Account selected = accounts.get(index);    

        System.out.println("Username: " + selected.getUsername());
        System.out.println("Aktif? " + selected.isActive());

        System.out.println("\n1. Aktifkan Akun");
        System.out.println("2. Non-aktifkan Akun");

        System.out.print("Pilih menu: ");
        int choice = input.nextInt();

        if (choice == 1) {
            selected.activate();
            System.out.println("Akun berhasil diaktifkan!"); 
        }
        else if (choice == 2){
            selected.deactivate();
            System.out.println("Akun berhasil dinonaktifkan!");
        }
        else {
            System.out.println("Pilihan tidak valid!");
        }
    }

}