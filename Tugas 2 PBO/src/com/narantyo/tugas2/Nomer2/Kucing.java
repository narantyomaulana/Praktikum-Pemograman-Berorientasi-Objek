package com.narantyo.tugas2.Nomer2;

// Class Kucing
public class Kucing extends Binatang {

    // Inisiasi variabel
    public String nama;
    public String meong;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas hewan Kucing
    public void meong(){
        System.out.println("Aktivitas\t\t: " + meong);
    }
}