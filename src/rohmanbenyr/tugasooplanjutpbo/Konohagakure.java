/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package rohmanbenyr.tugasooplanjutpbo;

public class Konohagakure {
    public int noRegistrasi;
    public String nama;
    public String Peringkat;

    public void setData(int noRegistrasi, String nama, String peringkat) {
        this.noRegistrasi = noRegistrasi;
        this.nama = nama;
        Peringkat = peringkat;
    }

    public void display() {
        System.out.println("No Registrasi : " + noRegistrasi);
        System.out.println("Nama \t\t  : " + nama);
        System.out.println("Peringkat \t  : " +Peringkat);
        System.out.println();
    }
}