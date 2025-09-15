/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Pulau;
import java.util.ArrayList;

public class PulauService {
    private final ArrayList<Pulau> daftarPulau = new ArrayList<>();
    private int idCounter = 1;

    // Tambah Pulau
    public void tambahPulau(String nama, String lokasi) {
        daftarPulau.add(new Pulau(idCounter++, nama, lokasi));
        System.out.println("Pulau berhasil ditambahkan!");
    }

    // Lihat Pulau
    public void lihatPulau() {
        if (daftarPulau.isEmpty()) {
            System.out.println("Belum ada data pulau.");
        } else {
            System.out.println("\nDaftar Pulau:");
            for (Pulau p : daftarPulau) {
                System.out.println(p.getId() + ". " + p.getNama() + " - " + p.getLokasi());
            }
        }
    }

    // Ubah Nama Pulau
    public void ubahNamaPulau(int id, String namaBaru) {
        for (Pulau p : daftarPulau) {
            if (p.getId() == id) {
                p.setNama(namaBaru);
                System.out.println("Nama pulau berhasil diubah!");
                return;
            }
        }
        System.out.println("Pulau dengan ID " + id + " tidak ditemukan.");
    }

    // Ubah Lokasi Pulau
    public void ubahLokasiPulau(int id, String lokasiBaru) {
        for (Pulau p : daftarPulau) {
            if (p.getId() == id) {
                p.setLokasi(lokasiBaru);
                System.out.println("Lokasi pulau berhasil diubah!");
                return;
            }
        }
        System.out.println("Pulau dengan ID " + id + " tidak ditemukan.");
    }

    // Hapus Pulau
    public void hapusPulau(int id) {
        boolean terhapus = daftarPulau.removeIf(p -> p.getId() == id);
        if (terhapus) {
            System.out.println("Pulau berhasil dihapus!");
        } else {
            System.out.println("Pulau dengan ID " + id + " tidak ditemukan.");
        }
    }
}
