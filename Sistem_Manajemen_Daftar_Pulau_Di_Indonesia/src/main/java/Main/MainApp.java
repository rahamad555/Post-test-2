/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import service.PulauService;

public class MainApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PulauService service = new PulauService();
            int pilihan;
            
            do {
                System.out.println("\n===== MENU DAFTAR PULAU INDONESIA =====");
                System.out.println("1. Tambah Pulau");
                System.out.println("2. Lihat Daftar Pulau");
                System.out.println("3. Ubah Nama Pulau");
                System.out.println("4. Ubah Lokasi Pulau");
                System.out.println("5. Hapus Pulau");
                System.out.println("6. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama pulau: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan lokasi pulau: ");
                        String lokasi = scanner.nextLine();
                        service.tambahPulau(nama, lokasi);
                    }
                        
                    case 2 -> service.lihatPulau();
                        
                    case 3 -> {
                        System.out.print("Masukkan ID pulau yang ingin diubah namanya: ");
                        int idNama = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan nama baru: ");
                        String namaBaru = scanner.nextLine();
                        service.ubahNamaPulau(idNama, namaBaru);
                    }
                        
                    case 4 -> {
                        System.out.print("Masukkan ID pulau yang ingin diubah lokasinya: ");
                        int idLokasi = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan lokasi baru: ");
                        String lokasiBaru = scanner.nextLine();
                        service.ubahLokasiPulau(idLokasi, lokasiBaru);
                    }
                        
                    case 5 -> {
                        System.out.print("Masukkan ID pulau yang ingin dihapus: ");
                        int idHapus = scanner.nextInt();
                        service.hapusPulau(idHapus);
                    }
                        
                    case 6 -> System.out.println("Terima kasih telah menggunakan sistem manajemen pulau!");
                        
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 6);
        }
    }
}

