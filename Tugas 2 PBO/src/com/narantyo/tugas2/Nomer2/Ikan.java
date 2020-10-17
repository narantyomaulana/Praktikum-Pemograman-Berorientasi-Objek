package com.narantyo.tugas2.Nomer2;

//  Class Ikan
public class Ikan extends Binatang{

    // variabel
    public String nama;
    public String berenang;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas hewan Ikan
    public void berenang(){
        System.out.println("Aktivitas\t\t: " + berenang);
    }
}