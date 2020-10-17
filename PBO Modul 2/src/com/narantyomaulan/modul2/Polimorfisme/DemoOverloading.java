package com.narantyomaulan.modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Girls Like You","Maroon 5");
        Lagu lagu2 = new Lagu("Perfect","ED Sheeran");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}