package com.narantyo.tugas2.Nomer3;

// Class Pacar yang mewariskan Class Mahasiswa
public class Pacar extends Mahasiswa {
    // Inisiasi variabel (namaPacar, lamaHubungan)
    public String namaPacar = "Tidak Ada -_-";
    public int lamaHubungan = 0;

    // Method getStatus
    public void getStatus(){
        System.out.println("Nama Pacar\t\t: " + namaPacar);
        System.out.println("Lama Hubungan\t: " + lamaHubungan);
    }
}
