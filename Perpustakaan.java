package com.uas;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {

    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBukuTersedia() {
        for (Buku buku : daftarBuku) {
            if (buku.getStatus().equals("Tersedia")) {
                System.out.println(buku.getJudul());
            }
        }
    }

    public void tampilkanInformasiBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Penulis: " + buku.getPenulis());
                System.out.println("Tahun terbit: " + buku.getTahunTerbit());
                System.out.println();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Tambahkan buku-buku
        perpustakaan.tambahBuku(new Buku("Harry Potter", "J.K. Rowling", 1997));
        perpustakaan.tambahBuku(new Buku("Lord of the Rings", "J.R.R. Tolkien", 1954));
        perpustakaan.tambahBuku(new Buku("The Hunger Games", "Suzanne Collins", 2008));

        // Tampilkan daftar buku tersedia
        perpustakaan.tampilkanDaftarBukuTersedia();

        // Tanyakan judul buku yang ingin dilihat informasinya
        System.out.println("Masukkan judul buku yang ingin dilihat informasinya: ");
        Scanner input = new Scanner(System.in);
        String judulBuku = input.nextLine();

        // Tampilkan informasi buku
        perpustakaan.tampilkanInformasiBuku(judulBuku);
    }
}

class Buku {

    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String status;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status = "Tersedia";
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
