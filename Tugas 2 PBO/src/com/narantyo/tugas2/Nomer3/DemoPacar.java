package com.narantyo.tugas2.Nomer3;

// Class DemoPacar
public class DemoPacar {
    public static void main(String[] args) {
        // objek dari kelas Mahasiswa dan Pacar
        Mahasiswa mahasiswa = new Mahasiswa();
        Pacar pacar = new Pacar();

        // Memanggil Method Mahasiswa dan pacar
        mahasiswa.getStatus();
        pacar.getStatus();
    }
}