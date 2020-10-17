package com.narantyomaulan.modul2.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X supperclass = new X();
        Y subclass = new Y();

        supperclass.getValue("mati lampu");
        subclass.getValue("mati listrik");
    }
}