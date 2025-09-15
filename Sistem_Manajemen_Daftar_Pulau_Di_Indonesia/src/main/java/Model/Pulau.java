/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Pulau {
    private final int id;
    private String nama;
    private String lokasi;

    // Constructor
    public Pulau(int id, String nama, String lokasi) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}

