/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.post_test_1_pbo;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tiga ArrayList paralel
        ArrayList<String> judulList = new ArrayList<>();
        ArrayList<String> genreList = new ArrayList<>();
        ArrayList<String> statusList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU AnimeStream.ID ===");
            System.out.println("1. Tambah Anime");
            System.out.println("2. Lihat Daftar Anime");
            System.out.println("3. Ubah Data Anime");
            System.out.println("4. Hapus Anime");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul anime: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan genre anime: ");
                    String genre = input.nextLine();
                    System.out.print("Masukkan status (On-going/Completed): ");
                    String status = input.nextLine();

                    judulList.add(judul);
                    genreList.add(genre);
                    statusList.add(status);
                    System.out.println("Anime berhasil ditambahkan!");
                    break;

                case 2:
                    if (judulList.isEmpty()) {
                        System.out.println("Belum ada anime dalam daftar.");
                    } else {
                        System.out.println("=== Daftar Anime ===");
                        for (int i = 0; i < judulList.size(); i++) {
                            System.out.println((i + 1) + ". " + judulList.get(i) + " | Genre: " + genreList.get(i) + " | Status: " + statusList.get(i));
                        }
                    }
                    break;

                case 3:
                    if (judulList.isEmpty()) {
                        System.out.println("Belum ada anime yang bisa diubah.");
                    } else {
                        System.out.print("Masukkan nomor anime yang ingin diubah: ");
                        int idxUbah = input.nextInt();
                        input.nextLine();
                        if (idxUbah > 0 && idxUbah <= judulList.size()) {
                            System.out.print("Judul baru (kosongkan jika tidak diubah): ");
                            String judulBaru = input.nextLine();
                            System.out.print("Genre baru (kosongkan jika tidak diubah): ");
                            String genreBaru = input.nextLine();
                            System.out.print("Status baru (kosongkan jika tidak diubah): ");
                            String statusBaru = input.nextLine();

                            if (!judulBaru.isEmpty()) judulList.set(idxUbah - 1, judulBaru);
                            if (!genreBaru.isEmpty()) genreList.set(idxUbah - 1, genreBaru);
                            if (!statusBaru.isEmpty()) statusList.set(idxUbah - 1, statusBaru);

                            System.out.println("Data anime berhasil diubah!");
                        } else {
                            System.out.println("Nomor anime tidak valid.");
                        }
                    }
                    break;

                case 4:
                    if (judulList.isEmpty()) {
                        System.out.println("Belum ada anime yang bisa dihapus.");
                    } else {
                        System.out.print("Masukkan nomor anime yang ingin dihapus: ");
                        int idxHapus = input.nextInt();
                        input.nextLine();
                        if (idxHapus > 0 && idxHapus <= judulList.size()) {
                            judulList.remove(idxHapus - 1);
                            genreList.remove(idxHapus - 1);
                            statusList.remove(idxHapus - 1);
                            System.out.println("Anime berhasil dihapus!");
                        } else {
                            System.out.println("Nomor anime tidak valid.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih sudah menggunakan AnimeStream.ID!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 5);

        input.close();
    }
}